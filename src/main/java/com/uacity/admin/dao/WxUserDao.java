package com.uacity.admin.dao;

import com.uacity.admin.domain.WxUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WxUserDao extends JpaRepository<WxUser, Integer>{
	
}
