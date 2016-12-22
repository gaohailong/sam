package com.sam.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.sam.entity.AssetType;

public class TestConn {

	@Test
	public void test() {
		// TODO Auto-generated method stub
		ppp();
	}

	public  void ppp(){
		InputStream is = Test.class.getResourceAsStream("/mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		List<AssetType> typeList = session.selectList("com.sam.dao.TypeDao.findAll");
		for(AssetType type:typeList){
			System.out.println(type);
		}
	}

}
