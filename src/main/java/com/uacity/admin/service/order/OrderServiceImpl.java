package com.ws.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ws.constant.SystemConstant;
import com.ws.db.dao.OrderDao;
import com.ws.db.dao.SubOrderDao;
import com.ws.db.model.Order;
import com.ws.db.model.OrderState;

@Service("OrderService")
public class OrderServiceImpl implements OrderService{

	@Autowired 
	private OrderDao dao;
	
	@Autowired 
	private SubOrderDao subOrderDao;
	
	public void save(Order order){
		dao.save(order);
	}

	@Override
	public Page<Order> search(Order order ,int page) {
		Pageable pa = new PageRequest(page, SystemConstant.pageSize);
		OrderState orderstate = order.getOrderstate();
		String code = order.getCode();
		String receiveidConsigneemobile = order.getReceiveid() != null ? order.getReceiveid().getConsigneemobile() : "";
		String receiveidConsigneename = order.getReceiveid() != null ? order.getReceiveid().getConsigneename() : "";
		if(orderstate == OrderState.未知){
			return dao.findByCodeContainingAndReceiveidConsigneenameContainingAndReceiveidConsigneemobileContaining
					(code, receiveidConsigneename, receiveidConsigneemobile, pa);
		}
		return dao.findByCodeContainingAndReceiveidConsigneenameContainingAndReceiveidConsigneemobileContainingAndOrderstate
				(code, receiveidConsigneename, receiveidConsigneemobile, orderstate, pa);
	}

	@Override
	public Order getById(int id) {
		Order order = dao.findOne(id);
		order.setSubOrder(subOrderDao.findByOrderid(order.getId()));
		return order;
	}

	@Override
	public void delete(Iterable<Order> admins) {
		dao.deleteInBatch(admins);
		
	}

	@Override
	public void deleteById(Integer id) {
		dao.delete(id);
	}

	@Override
	public void update(Order order) {
		dao.save(order);
	}

	@Override
	public Page<Order> searchByState(OrderState state, int page) {
		Pageable pa = new PageRequest(page, SystemConstant.pageSize);
		return dao.findByOrderstate(state,pa);
	}

}
