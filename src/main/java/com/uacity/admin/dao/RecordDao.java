package com.uacity.admin.dao;

import com.uacity.admin.domain.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordDao extends JpaRepository<Record, Integer>{
	
}
