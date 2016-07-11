package com.uacity.admin.controller;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.AdminInfo;
import com.uacity.admin.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller  
@RequestMapping("/produ")
public class ProdController {

	@Autowired
	private AdminService adminService;
	
	int pagesize = SystemConstant.pageSize;
	
	@RequestMapping(value="/search", method = RequestMethod.POST)
	public String search(@ModelAttribute("adminInfo") AdminInfo admin, Model model){
		System.out.println("search>>>>>>>>>>>>>>>>"+admin.getPage());
		System.out.println("search>>>>>>>>>>>>>>>>"+admin.getUsername());
		System.out.println("search>>>>>>>>>>>>>>>>"+admin.getRealname());
		Page<AdminInfo> p = adminService.search(admin.getUsername(), admin.getRealname(), admin.getPage());

        model.addAttribute("totalPage", p.getTotalPages());
        model.addAttribute("page", admin.getPage());
        model.addAttribute("items", p.getContent());
        return "admininfo/list";
	}

	@RequestMapping(value="/list")
	public String list(Model model){
		System.out.println("list>>>>>>>>>>>>");
		Page<AdminInfo> p = adminService.search("", "", 0);
		model.addAttribute("items", p.getContent());
		model.addAttribute("totalPage", p.getTotalPages());
		model.addAttribute("page", 1);
		AdminInfo adminInfo = new AdminInfo();
		adminInfo.setPage(0);
		model.addAttribute("adminInfo", adminInfo);
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
