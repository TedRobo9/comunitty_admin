package com.ws.db.dao;

import java.sql.Timestamp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.Order;
import com.ws.db.model.OrderState;

public interface OrderDao extends JpaRepository<Order, Integer>{
	
	public Page<Order> findByCodeContainingAndReceiveidConsigneenameContainingAndReceiveidConsigneemobileContaining
	(String code,String receiveidConsigneename,String receiveidConsigneemobile,Pageable pageable);
	
	public Page<Order> findByCodeContainingAndReceiveidConsigneenameContainingAndReceiveidConsigneemobileContainingAndOrderstate
	(String code,String receiveidConsigneename,String receiveidConsigneemobile,OrderState orderstate,Pageable pageable);
	
	public Page<Order> findByOrderstate(OrderState orderstate,Pageable pageable);
	
	public Long countByOrderstate(OrderState orderstate);
	
	public Long countByaddtimeBetween(Timestamp start, Timestamp end);
	
	
}
