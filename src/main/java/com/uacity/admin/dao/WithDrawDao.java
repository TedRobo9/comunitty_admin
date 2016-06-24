package com.uacity.admin.dao;

import com.uacity.admin.domain.WithDraw;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WithDrawDao extends JpaRepository<WithDraw, Integer>{
	
	public Page<WithDraw> findByWxuseridNickname(String nickname, Pageable pageable);
}
