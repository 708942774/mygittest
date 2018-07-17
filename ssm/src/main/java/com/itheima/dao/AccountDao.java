package com.itheima.dao;

import java.util.List;
import com.itheima.domain.Account;

public interface AccountDao {

	public List<Account> findAll();
	
	public void saveAccount(Account account);
}
