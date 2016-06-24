package com.uacity.admin.dao;

import com.uacity.admin.domain.Config;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigDao extends JpaRepository<Config, Integer>{
	
}
