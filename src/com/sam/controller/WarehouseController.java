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

import com.sam.entity.AssetHouse;
import com.sam.entity.AssetInfo;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;
import com.sam.service.AssetHouseService;
import com.sam.util.ConstantUtil;
import com.sam.util.ExportExcelUtil;

/**
 * 查询仓库
 * 
 * @author gaohailong
 *
 */
@RequestMapping(value="/wareHouse")
@Controller
public class WarehouseController extends BaseController {

	@Autowired
	private AssetHouseService assetHouseService;

	/**
	 * 查询所有的一级仓库
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/findAllFirstHouse", method = RequestMethod.GET)
	@ResponseBody
	public List<AssetHouse> findAllFirstHouse() throws Exception {
		return assetHouseService.findHouseByAhlevel(0);
	}
	
	
	/**
	 * 分页根据存放地点查询设备
	 * @author zhw
	 * @param ahname
	 * @param page
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findAssetInfosByAhname", method = RequestMethod.POST)
	public Pager<AssetInfo> findAssetInfosByAhname(String ahname, Integer page) {
		try {
			int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
			if(page != null) {
				pageNum = page;
			}
			Pager<AssetInfo> assetResult = assetHouseService.findAssetInfos(ahname, pageNum, ConstantUtil.DEFAULT_PAGE_SIZE);
			return assetResult;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询全部的仓库(用于下拉列表)
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/findAllSecondAssetHouse", method = RequestMethod.GET)
	public List<AssetHouse> findAllSecondAssetHouse() {
		try {
			List<AssetHouse> houseList = assetHouseService.findAllHouse();
			for (AssetHouse assetHouse : houseList) {
				System.out.println(assetHouse.getAhname());
			}
			return houseList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * 分页查询出所有仓库
	 * @author wc
	 * @param page
	 */
	@RequestMapping(value="/findHouse",method=RequestMethod.GET)
	@ResponseBody
	public Pager<AssetHouse> findHouse(Integer page){
		System.out.println("进findhouse方法");
		try{
		int pageNum = ConstantUtil.DEFAULT_PAGE_NUM;
		if(page!=null){
			pageNum = page;
		}
		int pageSize = ConstantUtil.DEFAULT_PAGE_SIZE;
		Pager<AssetHouse> houseResult = assetHouseService.findHouse(pageNum, pageSize);
		return houseResult;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
			
		}
	}
	
	/**
	 * 添加仓库
	 */
	@RequestMapping(value="/addHouse",method=RequestMethod.POST)
	@ResponseBody
	public int addHouse(
			@RequestParam(value="ahname",required= false)String ahname,
			@RequestParam(value="auname",required= false)String auname,
			@RequestParam(value="ahbeizhu",required = false)String ahbeizhu){
		AssetHouse assethouse = new AssetHouse();
		assethouse.setAhname(ahname);
		assethouse.setAuname(auname);
		assethouse.setAhbeizhu(ahbeizhu);
		try{
		int num = assetHouseService.addHouse(assethouse);
		return num;
		}catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		
		
	}
	/**
	 * 删除仓库
	 * @author wc
	 */
	@RequestMapping(value="/deleteHouse/{ahid}",method=RequestMethod.POST)
	@ResponseBody
	public int deleteHouse(
			@PathVariable(value="ahid")Integer ahid){
		System.out.println("ahid删除的"+ahid);
		int num = 0;
		try{
		   num = assetHouseService.deleteHouse(ahid);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		if(num==0)
			return -1;
		return num;
	}
	
	/**
	 * 修改仓库
	 * @author wc
	 */
	@RequestMapping(value="/updateHouse",method=RequestMethod.POST)
	@ResponseBody
	public int updateHouse(
		@RequestParam(value="ahid",required=false)Integer ahid,
		@RequestParam(value="ahname",required = false)String ahname,
		@RequestParam(value="auname",required = false)String auname,
		@RequestParam(value= "ahbeizhu",required = false)String ahbeizhu){
		System.out.println("ahid:"+ahid);
		int num = 0;
		try {
		AssetHouse assethouse = new AssetHouse();
		assethouse.setAhid(ahid);
		assethouse.setAhname(ahname);
		assethouse.setAuname(auname);
		assethouse.setAhbeizhu(ahbeizhu);
			System.out.println(assethouse.toString());
			num = assetHouseService.updateHouse(assethouse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(num==0)
		return -1;
		  return num;
		
	}
	
	/**
	 * 仓库的报表导出
	 * @author zhw
	 * @param response
	 * @param exporthouse
	 */
	@RequestMapping(value="/exportHouseExcel", method=RequestMethod.POST)
	public void exportHouseExcel(HttpServletResponse response,String exporthouse) {
		try {
			
			 String[] excelHeader = exporthouse.split(",");
			 List<AssetHouse> userList = assetHouseService.findAllHouse();
			  ExportExcelUtil.export(response, "仓库明细表", excelHeader, userList);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
