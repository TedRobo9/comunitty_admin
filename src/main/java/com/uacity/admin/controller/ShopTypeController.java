package com.uacity.admin.controller;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.UacShopTypeEntity;
import com.uacity.admin.domain.WxMenu;
import com.uacity.admin.service.shopType.UacShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eegijmc on 7/19/2016.
 */
@Controller
@RequestMapping("/shoptype.do")
public class ShopTypeController {

    @Autowired
    private UacShopTypeService service;


    @RequestMapping(value="/add")
    public String add(Model model){
        System.out.println("add>>>>>>>>>>>>");
        model.addAttribute("data",new UacShopTypeEntity());
        return "shoptype/detail";
    }

    @RequestMapping(value="/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        System.out.println("edit>>>>>>>>>>>>");
        UacShopTypeEntity entity = service.getById(id);
        model.addAttribute("data", entity);
        return "shoptype/detail";
    }

    @RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public Map<String, Object> search(@RequestBody UacShopTypeEntity entity){
        System.out.println("list>>>>>>>>>>>>");
        Page<UacShopTypeEntity> p = service.search(entity.getName(),entity.isTop(), 0);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("totalPage", p.getTotalPages());
        modelMap.put("pageSize", SystemConstant.pageSize);
        modelMap.put("total", p.getTotalElements());
        modelMap.put("page", entity.getPage());
        modelMap.put("data", p.getContent());
        modelMap.put("success", "true");
        return modelMap;
    }

    @RequestMapping(value="/list")
    public String list(Model model){
        System.out.println("list>>>>>>>>>>>>");
        Page<UacShopTypeEntity> p = service.search("", true, 0);
        model.addAttribute("items", p.getContent());
        model.addAttribute("totalPage", p.getTotalPages());
        model.addAttribute("page", 1);
        return "shoptype/list";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("data") UacShopTypeEntity entity){
        System.out.println("save>>>>>>>>>>>>"+entity.getName());
        service.save(entity);
        return "redirect:list";
    }

    @RequestMapping(value="/delete/{id}")
    public String delete(@PathVariable("id") int id){
        System.out.println("delete>>>>>>>>>>>>"+id);
        service.delete(id);
        return "redirect:/shopType/list";
    }
}
