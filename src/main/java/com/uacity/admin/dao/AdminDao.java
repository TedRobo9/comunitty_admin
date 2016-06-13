package com.ws.db.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.AdminInfo;

public interface AdminDao extends JpaRepository<AdminInfo, Integer>{

	public Page<AdminInfo> findByUsernameContainingAndRealnameContaining(String username,
			String realname, Pageable pageable);
	
	public AdminInfo findByUsernameAndPassword(String username, String password);

	public AdminInfo findByUsername(String username);
}
