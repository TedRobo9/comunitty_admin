package com.uacity.admin.controller;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.UacCategoryEntity;
import com.uacity.admin.service.category.UacCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eegijmc on 7/26/2016.
 */
@Controller
@RequestMapping("/category.do")
public class CategoryController {

    @Autowired
    private UacCategoryService service;

    @RequestMapping(value="/add")
    public String add(Model model){
        System.out.println("add>>>>>>>>>>>>");
        UacCategoryEntity parent = service.getById(1L);
        model.addAttribute("data",new UacCategoryEntity());
        return "category/detail";
    }

    @RequestMapping(value="/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        System.out.println("edit>>>>>>>>>>>>");
        UacCategoryEntity entity = service.getById(id);
        model.addAttribute("data", entity);
        return "category/detail";
    }

    @RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public Map<String, Object> search(@RequestBody UacCategoryEntity entity){
        System.out.println("list>>>>>>>>>>>>");
        Page<UacCategoryEntity> p = service.search(entity.getName(),entity.isValid(), 0);
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
        Page<UacCategoryEntity> p = service.search("", true, 0);
        model.addAttribute("items", p.getContent());
        model.addAttribute("totalPage", p.getTotalPages());
        model.addAttribute("page", 1);
        return "category/list";
    }

    @RequestMapping(value="/tree")
    public Map<String, Object> tree(@ModelAttribute("zId") int zPid, @ModelAttribute("pid") long pid){
        System.out.println("tree>>>>>>>>>>>>"+zPid);
        UacCategoryEntity categoryEntity = service.getById(pid);
        Map<String, Object> modelMap = new HashMap<String, Object>();
        int n = 0;
        for (UacCategoryEntity category : categoryEntity.getChildren()) {
            String id = zPid + String.valueOf(n++);
            modelMap.put("id", id);
            modelMap.put("pId", zPid);
            modelMap.put("name", category.getName());
        }
        return modelMap;
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("data") UacCategoryEntity entity){
        System.out.println("save>>>>>>>>>>>>"+entity.getName());
        service.save(entity);
        return "redirect:list";
    }

    @RequestMapping(value="/delete/{id}")
    public String delete(@PathVariable("id") int id){
        System.out.println("delete>>>>>>>>>>>>"+id);
        service.delete(id);
        return "redirect:/category.do/list";
    }


}
