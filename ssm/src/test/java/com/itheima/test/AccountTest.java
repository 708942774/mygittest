package com.itheima.test;

import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;

public class AccountTest {

	@Test
	public void mybatisTset() throws Exception {
		//读取配置文件
		InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
		//生成工厂对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		//
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//
		AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
		//调用方法
		List<Account> list = accountDao.findAll();
		Account account = new Account();
		account.setName("三千世界共主无敌德威宝宝龙");
		account.setMoney(999d);
		accountDao.saveAccount(account);
		sqlSession.commit();
		//打印
		System.out.println(list);
	}
}
