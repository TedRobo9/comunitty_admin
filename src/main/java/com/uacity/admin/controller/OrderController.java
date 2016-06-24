package com.uacity.admin.controller;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.Order;
import com.uacity.admin.domain.OrderState;
import com.uacity.admin.domain.SubOrder;
import com.uacity.admin.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller  
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> search(@RequestBody Order order){
		System.out.println("order search>>>>>>>>>>>>>>>>");
		Page<Order> p = orderService.search(order, order.getPage());
		Map<String, Object> modelMap = new HashMap<String, Object>();  
        modelMap.put("totalPage", p.getTotalPages());
        modelMap.put("pageSize", SystemConstant.pageSize);
        modelMap.put("total", p.getTotalElements());
        modelMap.put("page", order.getPage());
        modelMap.put("data", p.getContent()); 
        modelMap.put("success", "true");  
        return modelMap;
	}
	
	@RequestMapping(value="/list", method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> list(@RequestBody Order order){
		System.out.println("order list>>>>>>>>>>>>>>>>");
		Page<Order> p = orderService.searchByState(order.getOrderstate(), 0);
		Map<String, Object> modelMap = new HashMap<String, Object>();  
        modelMap.put("totalPage", p.getTotalPages());
        modelMap.put("pageSize", SystemConstant.pageSize);
        modelMap.put("total", p.getTotalElements());
        modelMap.put("page", 0);
        modelMap.put("data", p.getContent()); 
        modelMap.put("success", "true"); 
		return modelMap;
	}
	
	@RequestMapping(value="/state" , method = RequestMethod.GET)
	public String state(javax.servlet.http.HttpServletRequest request){
		System.out.println("order state>>>>>>>>>>>>>>>>");
//		int state;
//		OrderState orderstate;
//		try {
//			state = Integer.parseInt(request.getParameter("orderstate"));
//		} catch (NumberFormatException e) {  
//	        return null;
//		}
//		if(state == OrderState.取消.getValue()){
//			orderstate = OrderState.取消;
//		}else if(state == OrderState.已付款.getValue()){
//			orderstate = OrderState.已付款;
//		}else if(state == OrderState.已发货.getValue()){
//			orderstate = OrderState.已发货;
//		}else if(state == OrderState.已完成.getValue()){
//			orderstate = OrderState.已完成;
//		}else if(state == OrderState.未付款.getValue()){
//			orderstate = OrderState.未付款;
//		}else if(state == OrderState.退货.getValue()){
//			orderstate = OrderState.退货;
//		}else{
//			orderstate = OrderState.未付款;
//		}
//		Page<Order> p = orderService.searchByState(orderstate, 0);
//		Map<String, Object> modelMap = new HashMap<String, Object>();  
//        modelMap.put("totalPage", p.getTotalPages());
//        modelMap.put("pageSize", SystemConstant.pageSize);
//        modelMap.put("total", p.getTotalElements());
//        modelMap.put("page", 0);
//        modelMap.put("data", p.getContent()); 
//        modelMap.put("success", "true"); 
		request.setAttribute("orderstate", request.getParameter("orderstate"));
        return "/view/sys_order/sys_order";
	}
	
	@RequestMapping(value="/suborder")
	public String edit(javax.servlet.http.HttpServletRequest request){
		System.out.println("get suborder>>>>>>>>>>>>>>>>");
		int id;
		try {
			id = Integer.parseInt(request.getParameter("orderid"));
		} catch (NumberFormatException e) {  
	        return null;
		}
		Order order = orderService.getById(id);
		List<SubOrder> subOrderList = order.getSubOrder();
		request.setAttribute("order", order);
		request.setAttribute("suborder", subOrderList);
		return "/view/sys_order/sys_suborder";
	}
	
	@RequestMapping(value="/update" , method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> update(@RequestBody Order order){
		System.out.println("update order>>>>>>>>>>>>>>>>");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			
			Order o = orderService.getById(order.getId());
			o.setOrderstate(OrderState.已发货);
			o.setExpresscode(order.getExpresscode());
			o.setExpresscompany(order.getExpresscompany());
			orderService.save(o);
		} catch (Exception e) {
			modelMap.put("success", "false");  
	        return modelMap;
		}
        modelMap.put("success", "true");  
        return modelMap;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	
}
