package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.Menu;
import com.ws.db.model.ProdClass;
import com.ws.db.model.ProdType;

public interface ProdClassDao extends JpaRepository<ProdClass, Integer>{
	
}
