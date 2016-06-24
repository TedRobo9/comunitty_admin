package com.uacity.admin.dao;

import com.uacity.admin.domain.Prod;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdDao extends JpaRepository<Prod, Integer>{
	
	public Page<Prod> findByNameAndClassidAndTypeidAndStockAndGdstatus(String name,
			int classid, int typeid,int stock,String gdstatus,Pageable pageable);
	
}
