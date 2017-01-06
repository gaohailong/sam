package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetUser;

/**
 * 用户的dao
 * 
 * @author yty
 *
 */
public interface UserDao {

	/**
	 * 根据角色名称查询用户
	 */
	List<AssetUser> findUserByUrname(String urname) throws Exception;

	/**
	 * @author gaohailong 根据所有用户
	 */
	List<AssetUser> findAllUser() throws Exception;

	/**
	 * @author gaohailong 通过id查询用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	AssetUser findfindUserById(Integer id) throws Exception;
}
