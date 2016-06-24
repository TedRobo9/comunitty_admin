package com.uacity.admin.service.order;

import com.uacity.admin.domain.Order;
import com.uacity.admin.domain.OrderState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface OrderService {

	public void save(Order order);
	
	public Page<Order> search(Order order, int page);
	
	public Order getById(int id);
	
	public void delete(Iterable<Order> admins);
	
	public void deleteById(Integer id);
	
	public void update(Order order);
	
	public Page<Order> searchByState(OrderState state, int page);

}
