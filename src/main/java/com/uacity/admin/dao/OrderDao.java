package com.uacity.admin.dao;

import com.uacity.admin.domain.Order;
import com.uacity.admin.domain.OrderState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;


public interface OrderDao extends JpaRepository<Order, Integer>{
	
	public Page<Order> findByCodeContainingAndReceiveidConsigneenameContainingAndReceiveidConsigneemobileContaining
	(String code,String receiveidConsigneename,String receiveidConsigneemobile,Pageable pageable);
	
	public Page<Order> findByCodeContainingAndReceiveidConsigneenameContainingAndReceiveidConsigneemobileContainingAndOrderstate
	(String code, String receiveidConsigneename, String receiveidConsigneemobile, OrderState orderstate, Pageable pageable);
	
	public Page<Order> findByOrderstate(OrderState orderstate,Pageable pageable);
	
	public Long countByOrderstate(OrderState orderstate);
	
	public Long countByaddtimeBetween(Timestamp start, Timestamp end);
	
	
}
