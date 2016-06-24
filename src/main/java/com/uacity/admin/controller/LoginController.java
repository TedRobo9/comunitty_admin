package com.uacity.admin.controller;

import com.uacity.admin.common.util.DateUtil;
import com.uacity.admin.common.util.MD5Util;
import com.uacity.admin.domain.AdminInfo;
import com.uacity.admin.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller  
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value="/login222")  
	@ResponseBody  
	public Object test(@RequestBody AdminInfo admin){
		Map<String, Object> modelMap = new HashMap<String, Object>(); 
		modelMap.put("success", "true");
		return modelMap; 
	}
	
	@RequestMapping(value="/login") 
	public String login(javax.servlet.http.HttpServletRequest request){  
		
//		String redirectUrl = request.getParameter("backurl");
		String username = request.getParameter("username"); 
		String password = request.getParameter("password");
		if(password!=null){
			password = MD5Util.MD5Encode(password);
		}
		HttpSession session = request.getSession();
		AdminInfo admin = adminService.getAdmin(username, password);
		
		if(admin != null){
			session.setAttribute("username", username);
			session.setAttribute("login", "true");
			session.setAttribute("logintime", DateUtil.getDateStr(new Date()));
			session.setAttribute("realname", admin.getRealname());
		}else{
			System.out.println("password error or invalid user");
			request.setAttribute("msg", "password error or invalid user");
			return "redirect:/signin.jsp";
		}
		System.out.println(username+">>>");
		return "/index"; 
	}
	
	@RequestMapping(value="/logout") 
	public String logout(javax.servlet.http.HttpServletRequest request){  
		HttpSession session = request.getSession();
		session.invalidate();
		System.out.println("admin logout");
		return "redirect:/signin.jsp"; 
	}

	
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
}
