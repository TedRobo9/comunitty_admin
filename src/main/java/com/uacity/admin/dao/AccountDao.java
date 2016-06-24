package com.uacity.admin.dao;

import com.uacity.admin.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountDao extends JpaRepository<Account, Integer>{
	
}
