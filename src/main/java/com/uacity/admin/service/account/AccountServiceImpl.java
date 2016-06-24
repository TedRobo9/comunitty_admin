package com.uacity.admin.service.account;

import com.uacity.admin.dao.AccountDao;
import com.uacity.admin.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService{

	@Autowired 
	private AccountDao dao;
	
	@Override
	public void save(Account account) {
		dao.save(account);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Account> getAllAccount() {
		return dao.findAll();
	}

	@Override
	public Account getAccountById(Integer id) {
		return dao.findOne(id);
	}
}
