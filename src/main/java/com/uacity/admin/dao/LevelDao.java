package com.uacity.admin.dao;

import com.uacity.admin.domain.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LevelDao extends JpaRepository<Level, Integer>{
	
	//TODO
//	@Query("from HC_BIZ_LEVEL a where a.levelno = ?1")
	@Query("from HC_BIZ_LEVEL a where a.integral = ?1")
	public List<Level> findByCondition(int integral);
}
