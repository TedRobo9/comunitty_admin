package com.ws.service.order;

import org.springframework.data.domain.Page;

import com.ws.db.model.Order;
import com.ws.db.model.OrderState;

public interface OrderService {

	public void save(Order order);
	
	public Page<Order> search(Order order, int page);
	
	public Order getById(int id);
	
	public void delete(Iterable<Order> admins);
	
	public void deleteById(Integer id);
	
	public void update(Order order);
	
	public Page<Order> searchByState(OrderState state, int page);

}
