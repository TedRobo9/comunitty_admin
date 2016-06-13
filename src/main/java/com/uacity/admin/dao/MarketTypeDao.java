package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.MarketType;
import com.ws.db.model.Menu;

public interface MarketTypeDao extends JpaRepository<MarketType, Integer>{
	
}
