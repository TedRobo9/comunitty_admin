package com.uacity.admin.controller;

import com.uacity.admin.domain.Config;
import com.uacity.admin.service.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller  
@RequestMapping("/config")
public class ConfigController {

	@Autowired
	private ConfigService configService;

	
	@RequestMapping(value="/edit")
	public String edit(javax.servlet.http.HttpServletRequest request){
		System.out.println("config edit");
		int id = 1;
		Config config = configService.getConfigById(id);
		request.setAttribute("config", config);
		return "/view/sys_config/sys_set";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> save(@RequestBody Config config){
		System.out.println("config save");
		configService.save(config);
		Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", "true");  
        return modelMap;
	}
	

	
	
	
	public ConfigService getConfigService() {
		return configService;
	}

	public void setConfigService(ConfigService configService) {
		this.configService = configService;
	}
}
