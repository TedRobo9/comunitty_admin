package com.uacity.admin.dao;

import com.uacity.admin.domain.Integralrecord;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IntegralrecordDao extends JpaRepository<Integralrecord, Integer>{

//	@Query("from Integralrecord a where 1 = 1")
//	public Page<Integralrecord> findByCondition(Pageable pageable);
}
