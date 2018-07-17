package com.itheima.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	public AccountService accountService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Account> list = accountService.findAll();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/save")
	public String save(Account account) {
		accountService.saveAccount(account);
		return "redirect:findAll";
	}
	
	@RequestMapping("/toSave")
	public String toSave() {
		return "save";
	}
	
}
