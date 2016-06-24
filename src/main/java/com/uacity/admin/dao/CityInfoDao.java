package com.uacity.admin.dao;

import com.uacity.admin.domain.CityInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CityInfoDao extends JpaRepository<CityInfo, Integer>{
	
}
