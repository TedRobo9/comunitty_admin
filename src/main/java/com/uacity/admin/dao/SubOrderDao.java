package com.ws.db.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.db.model.SubOrder;

public interface SubOrderDao extends JpaRepository<SubOrder, Integer>{

		//where aaaa= ?1 And bbb=?2
		//public List<Order> findByCondition(String aaa,String bbb);	
	
	public List<SubOrder> findByOrderid(int orderid);
	
}
