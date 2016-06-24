package com.uacity.admin.dao;

import com.uacity.admin.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuDao extends JpaRepository<Menu, Integer>{
	
	@Query("from HC_SYS_MENU a where a.levelno = :levelno")
	public List<Menu> findByLevelno(@Param("levelno") int levelno);
	
//	@Query("from Menu a where a.levelno = ?1")
//	public List<Menu> findByLevelno( int levelno);
	
}
