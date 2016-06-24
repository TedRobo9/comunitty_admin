package com.uacity.admin.dao;


import com.uacity.admin.domain.AdminInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminDao extends JpaRepository<AdminInfo, Integer>{

	public Page<AdminInfo> findByUsernameContainingAndRealnameContaining(String username,
																		 String realname, Pageable pageable);
	
	public AdminInfo findByUsernameAndPassword(String username, String password);

	public AdminInfo findByUsername(String username);
}
