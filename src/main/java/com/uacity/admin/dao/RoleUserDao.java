package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.Menu;
import com.ws.db.model.RoleUser;

public interface RoleUserDao extends JpaRepository<RoleUser, Integer>{
	
}
