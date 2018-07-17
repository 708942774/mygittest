package com.itheima.service;

import java.util.List;

import com.itheima.domain.Account;

public interface AccountService {

	public List<Account> findAll();
	
	public void saveAccount(Account account);
}
