package com.uacity.admin.service.account;

import com.uacity.admin.domain.Account;

import java.util.List;

public interface AccountService {

	public void save(Account account);
	
	public void delete(Integer id);
	
	public List<Account> getAllAccount();
	
	public Account getAccountById(Integer id);


	

}
