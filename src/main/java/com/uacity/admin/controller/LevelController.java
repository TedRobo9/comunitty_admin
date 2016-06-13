package com.ws.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ws.db.model.Level;
import com.ws.service.level.LevelService;

@Controller  
@RequestMapping("/level")
public class LevelController {

	@Autowired
	private LevelService levelService;
	
	
	@RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> search(@RequestBody Level level){ 
		System.out.println("search level");
		List<Level> list = levelService.search(level);
		Map<String, Object> modelMap = new HashMap<String, Object>();  
        modelMap.put("data", list); 
        modelMap.put("success", "true");  
        return modelMap;
	}
	
	@RequestMapping(value="/add")
	public String add(javax.servlet.http.HttpServletRequest request){
		System.out.println("add>>>>>>>>>>>>");
		request.setAttribute("level", new Level());
		request.setAttribute("oper", "add");
		return "/view/sys_Member/sys_Member_level";
	}
	
	@RequestMapping(value="/edit")
	public String edit(javax.servlet.http.HttpServletRequest request){
		System.out.println("edit>>>>>>>>>>>>");
		int id = Integer.parseInt(request.getParameter("id"));
		Level level = levelService.getLevelById(id);
		request.setAttribute("level", level);
		request.setAttribute("oper", "edit");
		return "/view/sys_Member/sys_Member_level";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> save(@RequestBody Level level){
		System.out.println("save>>>>>>>>>>>>");
		levelService.save(level);
		Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", "true");  
        return modelMap;
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST, consumes="application/json")
	public Map<String, Object> delete(javax.servlet.http.HttpServletRequest request){
		System.out.println("delete>>>>>>>>>>>>" );
		int id = Integer.parseInt(request.getParameter("id"));
		levelService.delete(id);
		Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", "true");  
        return modelMap;
	}

	public LevelService getLevelService() {
		return levelService;
	}

	public void setLevelService(LevelService levelService) {
		this.levelService = levelService;
	}
	
}
