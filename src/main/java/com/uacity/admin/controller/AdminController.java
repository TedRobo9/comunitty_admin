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
		model.addAttribute("totalPage", p.getTotalPages());
		model.addAttribute("page", 1);
		return "admininfo/list";
	}
	
	@RequestMapping(value="/add")
	public String add(Model model){
		System.out.println("add>>>>>>>>>>>>");
		model.addAttribute("adminInfo", new AdminInfo());
		return "admininfo/detail";
	}

	@RequestMapping(value="/edit/userid/{userid}")
	public String edit(@PathVariable("userid") int userid, Model model){
		System.out.println("edit>>>>>>>>>>>>");
		AdminInfo admin = adminService.getById(userid);
		model.addAttribute("adminInfo", admin);
		return detailPage();
	}

	@RequestMapping("/detailpage")
	public String detailPage() {
		return "admininfo/detail";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("adminInfo") AdminInfo admin){
		adminService.save(admin);
		return "redirect:list";
	}
	
	@RequestMapping(value="/delete/userid/{userid}")
	public String delete(@PathVariable("userid") int userid){
		System.out.println("delete>>>>>>>>>>>>"+userid);
		adminService.deleteById(userid);
		return "redirect:/adminInfo/list";
	}
	
	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
}
