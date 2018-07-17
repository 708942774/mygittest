package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;

public class SpringTest {

	@Test
	public void springTest() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AccountService accountService = ac.getBean(AccountService.class);
		
		List<Account> list = accountService.findAll();
		
		System.out.println(list);
		
		Account account = new Account();
		account.setName("九天大鳖");
		accountService.saveAccount(account);
	}
	
}
