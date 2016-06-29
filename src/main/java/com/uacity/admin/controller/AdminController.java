package com.uacity.admin.controller;

import com.uacity.admin.common.util.MD5Util;
import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.AdminInfo;
import com.uacity.admin.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Controller  
@RequestMapping("/adminInfo")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	int pagesize = SystemConstant.pageSize;
	
	@RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
	@ResponseBody 
	public Map<String, Object> search(@RequestBody AdminInfo admin){
		System.out.println("search>>>>>>>>>>>>>>>>"+admin.getPage());
		Page<AdminInfo> p = adminService.search(admin.getUsername(), admin.getRealname(), admin.getPage());
		Map<String, Object> modelMap = new HashMap<String, Object>();  
        modelMap.put("totalPage", p.getTotalPages());
        modelMap.put("pageSize", SystemConstant.pageSize);
        modelMap.put("total", p.getTotalElements());
        modelMap.put("page", admin.getPage());
        modelMap.put("data", p.getContent()); 
        modelMap.put("success", "true");  
        return modelMap;
	}

	@RequestMapping(value="/list")
	public String list(Model model){
		System.out.println("list>>>>>>>>>>>>");
		Page<AdminInfo> p = adminService.search("", "", 0);
		model.addAttribute("items", p.getContent());
		return "admininfo/list";
	}
	
	@RequestMapping(value="/add")
	public String add(Model model){
		System.out.println("add>>>>>>>>>>>>");
		model.addAttribute("adminInfo", new AdminInfo());
		return "admininfo/detail";
	}
	
	@RequestMapping(value="/edit")
	public String edit(javax.servlet.http.HttpServletRequest request){
		System.out.println("edit>>>>>>>>>>>>");
		AdminInfo admin;
		if(request.getParameter("userid") == null || "".equals(request.getParameter("userid"))){
			String username = request.getSession().getAttribute("username").toString();
			admin = adminService.getByName(username);
		}else{
			int id = Integer.parseInt(request.getParameter("userid"));
			admin = adminService.getById(id);
		}
		request.setAttribute("admin", admin);
		request.setAttribute("oper", "edit");
		return "/view/sys_user/sys_admin_edit";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	@ResponseBody 
	public Map<String, Object> save(@ModelAttribute("adminInfo") AdminInfo admin){
		System.out.println("save>>>>>>>>>>>>" + admin.getOper());
		Map<String, Object> modelMap = new HashMap<String, Object>();
		if(admin.getPassword().equals(admin.getPassword2())){
			if(admin.getPassword().equals("******") || admin.getPassword2().equals("******")){
				AdminInfo a = adminService.getById(admin.getUserid());
				admin.setPassword(a.getPassword());
			}else{
				admin.setPassword(MD5Util.MD5Encode(admin.getPassword()));
			}
			
			System.out.println(admin.getRealname());
			adminService.save(admin);
			modelMap.put("success", "true"); 
		}else{
			modelMap.put("success", "false");
			modelMap.put("message", "两次密码不一致！");
		}
        return modelMap;
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody 
	public Map<String, Object> delete(javax.servlet.http.HttpServletRequest request){
		System.out.println("delete>>>>>>>>>>>>");
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			int id = Integer.parseInt(request.getParameter("userid"));
			adminService.deleteById(id);
		} catch (Exception e) {
			modelMap.put("success", "false"); 
			return modelMap;
		}
        modelMap.put("success", "true");  
        return modelMap;
	}
	
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
}
