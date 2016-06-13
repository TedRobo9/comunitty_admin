package com.ws.db.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.AdminInfo;
import com.ws.db.model.Menu;
import com.ws.db.model.ProdType;

public interface ProdTypeDao extends JpaRepository<ProdType, Integer>{
	
	
}
