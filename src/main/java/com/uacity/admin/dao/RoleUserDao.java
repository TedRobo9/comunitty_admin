package com.uacity.admin.dao;

import com.uacity.admin.domain.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleUserDao extends JpaRepository<RoleUser, Integer>{
	
}
