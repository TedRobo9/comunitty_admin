package com.ws.service.account;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ws.db.model.Account;
import com.ws.db.model.AdminInfo;
import com.ws.db.model.Menu;

public interface AccountService {

	public void save(Account account);
	
	public void delete(Integer id);
	
	public List<Account> getAllAccount();
	
	public Account getAccountById(Integer id);


	

}
