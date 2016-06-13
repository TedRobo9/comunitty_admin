package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.Menu;
import com.ws.db.model.WxUser;

public interface WxUserDao extends JpaRepository<WxUser, Integer>{
	
}
