package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.Config;
import com.ws.db.model.Menu;

public interface ConfigDao extends JpaRepository<Config, Integer>{
	
}
