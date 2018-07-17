package com.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao accountDao;
	
	@Override
	public List<Account> findAll() {
		return accountDao.findAll();
	}

	@Override
	public void saveAccount(Account account) {
		accountDao.saveAccount(account);
		int i = 1/0;
	}

}
