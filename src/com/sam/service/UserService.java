package com.sam.service;

import java.util.List;

import com.sam.entity.AssetApply;
import com.sam.entity.AssetUser;
import com.sam.entity.Pager;

/**
 * 用户表的service
 * 
 * @author yty
 *
 */
public interface UserService {
	/**
	 * 人员注册
	 * @author wc
	 *
	 */
	int addUser(AssetUser assetuser) throws Exception;
	
	/**
	 * 删除人员
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
	 * 根据用户的角色名称查询用户
	 */
	List<AssetUser> findfindUserByUrname(String urname) throws Exception;

	/**
	 * @author gaohailong 查询所有的用户
	 * @return
	 * @throws Exception
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
	
	/**
	 * 分页查询所有用户
	 * @return
	 * @throws Exception
	 */
	Pager<AssetUser> findUser(int pageNum,int pageSize)throws Exception;
}
