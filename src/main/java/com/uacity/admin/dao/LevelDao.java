package com.ws.db.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ws.db.model.AdminInfo;
import com.ws.db.model.Level;

public interface LevelDao extends JpaRepository<Level, Integer>{
	
	//TODO
//	@Query("from HC_BIZ_LEVEL a where a.levelno = ?1")
	@Query("from HC_BIZ_LEVEL a where a.integral = ?1")
	public List<Level> findByCondition(int integral);
}
