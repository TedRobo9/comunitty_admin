package com.uacity.admin.dao;

import com.uacity.admin.domain.SubOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubOrderDao extends JpaRepository<SubOrder, Integer>{

		//where aaaa= ?1 And bbb=?2
		//public List<Order> findByCondition(String aaa,String bbb);	
	
	public List<SubOrder> findByOrderid(int orderid);
	
}
