package com.ws.db.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ws.db.model.Integralrecord;

public interface IntegralrecordDao extends JpaRepository<Integralrecord, Integer>{

//	@Query("from Integralrecord a where 1 = 1")
//	public Page<Integralrecord> findByCondition(Pageable pageable);
}
