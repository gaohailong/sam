package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sam.entity.AssetUser;
import com.sam.service.UserService;

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
	 * 根据角色名称查询用户信息
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
}
