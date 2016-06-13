package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.Account;
import com.ws.db.model.Menu;

public interface AccountDao extends JpaRepository<Account, Integer>{
	
}
