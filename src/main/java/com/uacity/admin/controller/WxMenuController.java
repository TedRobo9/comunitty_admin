package com.uacity.admin.controller;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.WxMenu;
import com.uacity.admin.service.wxmenu.WxMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eegijmc on 7/11/2016.
 */

@Controller
@RequestMapping("/wxmenu")
public class WxMenuController {

    @Autowired
    public WxMenuService service;

    @RequestMapping(value="/add")
    public String add(Model model){
        System.out.println("add>>>>>>>>>>>>");
        model.addAttribute("data", new WxMenu());
        return "wxmenu/detail";
    }

    @RequestMapping(value="/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        System.out.println("edit>>>>>>>>>>>>");
        WxMenu wxMenu = service.getById(id);
        model.addAttribute("data", wxMenu);
        return "wxmenu/detail";
    }

    @RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public Map<String, Object> search(@RequestBody WxMenu wxMenu){
        System.out.println("list>>>>>>>>>>>>");
        Page<WxMenu> p = service.search(wxMenu.getName(),wxMenu.getType(),wxMenu.getStatus(),0);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("totalPage", p.getTotalPages());
        modelMap.put("pageSize", SystemConstant.pageSize);
        modelMap.put("total", p.getTotalElements());
        modelMap.put("page", wxMenu.getPage());
        modelMap.put("data", p.getContent());
        modelMap.put("success", "true");
        return modelMap;
    }

    @RequestMapping(value="/list")
    public String list(Model model){
        System.out.println("list>>>>>>>>>>>>");
        Page<WxMenu> p = service.search("","",1,0);
        model.addAttribute("items", p.getContent());
        model.addAttribute("totalPage", p.getTotalPages());
        model.addAttribute("page", 1);
        return "wxmenu/list";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("data") WxMenu wxMenu){
        service.save(wxMenu);
        return "redirect:list";
    }

    @RequestMapping(value="/delete/{id}")
    public String delete(@PathVariable("id") int id){
        System.out.println("delete>>>>>>>>>>>>"+id);
        service.delete(id);
        return "redirect:/wxmenu/list";
    }

}
