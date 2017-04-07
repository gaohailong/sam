package com.sam.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetApply;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;
import com.sam.service.UserService;
import com.sam.util.ConstantUtil;
import com.sam.util.ExportExcelUtil;

/**
 * 用户表的controller
 * 
 * @author yty
 *
 */
@Controller
@RequestMapping(value = "/userController")
public class UserController {

	@Autowired
	private UserService userService;
	/**
	 * 注册用户
	 */
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public int addUser(
			@RequestParam(value="auname",required= false)String auname,
			@RequestParam(value="aupass",required= false)String aupass,
			@RequestParam(value="auphone",required = false)String auphone,
			@RequestParam(value="urname",required = false)String urname,
			@RequestParam(value="udname",required = false)String udname){
		AssetUser assetuser = new AssetUser();
		assetuser.setAuname(auname);
		assetuser.setAupass(aupass);
		assetuser.setAuphone(auphone);
		assetuser.setUrname(urname);
		assetuser.setUdname(udname);
		try{
		int num = userService.addUser(assetuser);
		return num;
		}catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		
		
	}

	/**
	 * 根据角色名称查询用户信息
	 */

	@RequestMapping(value = "/findUserByUrname", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetUser> findUserByUrname(String urname) {
		List<AssetUser> userList = null;
		try {
			userList = userService.findfindUserByUrname(urname);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

	/**
	 * 根据id查询用户信息
	 * 
	 * @author gaohailong
	 */
	@RequestMapping(value = "/findUserById", method = RequestMethod.GET)
	@ResponseBody
	public AssetUser findUserById(Integer id) {
		AssetUser user = null;
		try {
			user = userService.findfindUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	/**
	 * 遍历所有用户
	 * 
	 * @author gaohailong 查询所有用户
	 */
	@ResponseBody
	@RequestMapping(value = "/findAllUser", method = RequestMethod.GET)
	public List<AssetUser> findAllUser() {
		List<AssetUser> userList = null;
		try {
			userList = userService.findAllUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	/**
	 * 分页查询出所有用户
	 * @author wc
	 * @param page
	 */
	@RequestMapping(value="/findUser",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetUser> findUser(Integer page){
		System.out.println("进finduser方法");
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		Pager<AssetUser> userResult = userService.findUser(pageNum, pageSize);
		return userResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
			
		}
	}
	
	/**
	 * 删除人员
	 * @author wc
	 */
	@RequestMapping(value="/deleteUser/{auid}",method=RequestMethod.POST)
	@ResponseBody
	public int deleteApply(
			@PathVariable(value="auid")Integer auid){
		System.out.println("auid删除的"+auid);
		int num = 0;
		try{
		   num = userService.deleteUser(auid);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		if(num==0)
			return -1;
		return num;
	}
	
	/**
	 * 修改用户
	 * @author wc
	 */
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	@ResponseBody
	public int updateUser(
		@RequestParam(value="auid",required=false)Integer auid,
		@RequestParam(value="auname",required = false)String auname,
		@RequestParam(value="auphone",required = false)String auphone,
		@RequestParam(value= "udname",required = false)String udname,
		@RequestParam(value ="urname",required = false)String urname){
		System.out.println("auid:"+auid);
		int num = 0;
		try {
			AssetUser assetuser = new AssetUser();
			assetuser.setAuid(auid);
			assetuser.setAuname(auname);
			assetuser.setAuphone(auphone);
			assetuser.setUdname(udname);
			assetuser.setUrname(urname);
			System.out.println(assetuser.toString());
			num = userService.updateUser(assetuser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(num==0)
		return -1;
		  return num;
		
	}
	@RequestMapping(value="/loginCheck",method=RequestMethod.POST)
	@ResponseBody
	public AssetUser loginCheck(String username,String password){
		AssetUser user = new AssetUser();
		user.setAuname(username);
		user.setAupass(password);
		try {
			AssetUser nowUser = userService.findUserWhenLogin(user);
			if(nowUser==null){
				return null;
			}
			if(nowUser.getUrname().equals("管理员")){
				nowUser.setUrname("0");
			}else{
				nowUser.setUrname("1");
			}
			return nowUser;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	/**
	 * 人员的报表导出
	 * @author zhw
	 * @param response
	 * @param exportuser
	 */
	@RequestMapping(value="/exportUserExcel", method=RequestMethod.POST)
	public void exportUserExcel(HttpServletResponse response,String exportuser) {
		try {
			 String[] excelHeader = exportuser.split(",");
			 List<AssetUser> userList = userService.findAllUser();
			  ExportExcelUtil.export(response, "人员明细表", excelHeader, userList);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
