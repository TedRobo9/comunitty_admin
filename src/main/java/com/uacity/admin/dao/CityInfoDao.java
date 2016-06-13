package com.ws.db.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.CityInfo;
import com.ws.db.model.Menu;

public interface CityInfoDao extends JpaRepository<CityInfo, Integer>{
	
}
