package com.uacity.admin.controller;

import com.uacity.admin.common.util.SystemConstant;
import com.uacity.admin.domain.UacShopEntity;
import com.uacity.admin.domain.UacShopTypeEntity;
import com.uacity.admin.service.shop.UacShopService;
import com.uacity.admin.service.shopType.UacShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by eegijmc on 7/19/2016.
 */
@Controller
@RequestMapping("/shop.do")
public class ShopController {

    @Autowired
    private UacShopService shopService;

    @Autowired
    private UacShopTypeService shopTypeService;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value="/add")
    public String add(Model model){
        System.out.println("add>>>>>>>>>>>>");
        List<UacShopTypeEntity> types = shopTypeService.getAll();
        model.addAttribute("data",new UacShopEntity());
        model.addAttribute("types", types);
        return "shop/detail";
    }

    @RequestMapping(value="/edit/{id}")
    public String edit(@PathVariable("id") long id, Model model) {
        System.out.println("edit>>>>>>>>>>>>");
        UacShopEntity entity = shopService.getById(id);
        List<UacShopTypeEntity> types = shopTypeService.getAll();
        model.addAttribute("data", entity);
        model.addAttribute("types", types);
        return "shop/detail";
    }

    @RequestMapping(value="/search" , method = RequestMethod.POST, consumes="application/json")
    @ResponseBody
    public Map<String, Object> search(@RequestBody UacShopEntity entity){
        System.out.println("list>>>>>>>>>>>>");
        Page<UacShopEntity> p = shopService.search(entity.getName(), 0);
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
        Page<UacShopEntity> p = shopService.search("", 0);
        model.addAttribute("items", p.getContent());
        model.addAttribute("totalPage", p.getTotalPages());
        model.addAttribute("page", 1);
        return "shop/list";
    }

//    @RequestMapping(value="/upload", method = RequestMethod.POST)
//    public String upload( @RequestParam("mythumb") MultipartFile file) {
//        if (!file.isEmpty()) {
//            System.out.print("file:>>>>>>>>>>>>" + file.getOriginalFilename());
//            try {
//                String uploadsDir = "/uploads/";
//                String realPath2Uploads = request.getServletContext().getRealPath(uploadsDir);
//                File dir = new File(realPath2Uploads);
//                if (!dir.exists()) {
//                    dir.mkdir();
//                }
//                String filePath = realPath2Uploads + File.separator + file.getOriginalFilename();
//                file.transferTo(new File(filePath));
////                entity.setThumb(uploadsDir + file.getOriginalFilename());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//        return "";
//    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(
//    public String save(@RequestParam("name") String name,
//                       @RequestParam("address") String address,
//                       @ModelAttribute("type") UacShopTypeEntity type,
//                       @RequestParam("phone") String phone,
//                       @RequestParam("valid") Boolean valid,
                        @RequestParam("mythumb") MultipartFile file,
                        @ModelAttribute("data") UacShopEntity entity){

        System.out.println("type id>>>>>>>>"+entity.getType().getId()+entity.getType().getName());

        if (!file.isEmpty()) {
            System.out.print("file:>>>>>>>>>>>>" + file.getOriginalFilename());
            try {
                String uploadsDir = "/uploads/";
                String realPath2Uploads = request.getServletContext().getRealPath(uploadsDir);
                File dir = new File(realPath2Uploads);
                if (!dir.exists()) {
                    dir.mkdir();
                }
                String filePath = realPath2Uploads + File.separator + file.getOriginalFilename();
                file.transferTo(new File(filePath));
                entity.setThumb(uploadsDir + file.getOriginalFilename());
//                entity.setThumb(uploadsDir + file.getOriginalFilename());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        shopService.save(entity);
        return "redirect:list";
    }

    @RequestMapping(value="/delete/{id}")
    public String delete(@PathVariable("id") long id){
        System.out.println("delete>>>>>>>>>>>>"+id);
        shopService.delete(id);
        return "redirect:/shopAction/list";
    }
}
