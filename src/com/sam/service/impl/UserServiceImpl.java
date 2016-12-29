package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.UserDao;
import com.sam.entity.AssetUser;
import com.sam.service.UserService;

/**
 * 用户表的serviceImpl
 * @author yty
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	/**
	 * 根据用户的角色名称查询用户
	 */
	@Override
	public List<AssetUser> findfindUserByUrname(String urname) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUserByUrname(urname);
	}

}
