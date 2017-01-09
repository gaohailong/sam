package com.sam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.UserDao;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;
import com.sam.service.UserService;

/**
 * 用户表的serviceImpl
 * 
 * @author yty
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 根据用户的角色名称查询用户
	 */
	@Override
	public List<AssetUser> findfindUserByUrname(String urname) throws Exception {
		return userDao.findUserByUrname(urname);
	}

	@Override
	public List<AssetUser> findAllUser() throws Exception {
		return userDao.findAllUser();
	}

	@Override
	public AssetUser findfindUserById(Integer id) throws Exception {
		return userDao.findfindUserById(id);
	}

	@Override
	public AssetUser findUserByName(String auname) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUserByName(auname);
	}

	@Override
	public Pager<AssetUser> findUser(int pageNum, int pageSize)
			throws Exception {
		// TODO Auto-generated method stub
		List<AssetUser> userList = findAllUser();
		Pager<AssetUser> pager = new Pager<AssetUser>(pageNum,pageSize,userList);
		return pager;
	}

	@Override
	public int addUser(AssetUser assetuser) throws Exception {
		// TODO Auto-generated method stub
		return userDao.addUser(assetuser);
	}

	@Override
	public int deleteUser(Integer auid) throws Exception {
		// TODO Auto-generated method stub
		return userDao.deleteUser(auid);
	}

	@Override
	public int updateUser(AssetUser assetuser) throws Exception {
		// TODO Auto-generated method stub
		return userDao.updateUser(assetuser);
	}

}
