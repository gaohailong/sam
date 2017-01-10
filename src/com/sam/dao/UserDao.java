package com.sam.dao;

import java.util.List;

import com.sam.entity.AssetApply;
import com.sam.entity.AssetUser;

/**
 * 用户的dao
 * 
 * @author yty
 *
 */
public interface UserDao {
	/**
	 * 人员注册
	 * @author wc
	 *
	 */
	int addUser(AssetUser assetuser) throws Exception;
	
	/**
	 * 删除用户
	 * @param auid
	 * @return
	 * @throws Exception
	 */
	int deleteUser(Integer auid)throws Exception;
	
	/**
	 * 修改用户
	 * @param auid
	 * @return
	 * @throws Exception
	 */
	int updateUser(AssetUser assetuser)throws Exception;

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
	
	/**
	 * 通过申请人名臣查询
	 * @param auname
	 */
	AssetUser findUserByName(String auname)throws Exception;
}
