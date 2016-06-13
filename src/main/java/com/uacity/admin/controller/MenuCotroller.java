package com.ws.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.db.model.Menu;
import com.ws.service.menu.MenuService;

@Controller  
@RequestMapping("/menu")
public class MenuCotroller {
	
	@Autowired
	private MenuService menuService;
	
	List<Menu> datalist = null;

	@RequestMapping(value="/list" , method = RequestMethod.GET)
	@ResponseBody 
	public Map<String, Object> list(){ 
		System.out.println("getAll menu>>>>>>>>>>>>>>>>");
		if(datalist == null){
			datalist =  menuService.getTopMenu();
		}
		Map<String, Object> modelMap = new HashMap<String, Object>();  
        modelMap.put("data", datalist); 
        modelMap.put("success", "true");  
        return modelMap;
	}
	
	
	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
}
