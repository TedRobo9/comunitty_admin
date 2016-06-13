package com.uacity.admin.controller;

import com.uacity.admin.domain.User;
import com.uacity.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ted on 16/4/23.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    UserService userService;


    @RequestMapping
    @ResponseBody
    public String index() {
        return "Hello! Spring Boot~";
    }


    @RequestMapping(value = { "/user/{id}" }, method = { RequestMethod.GET })
    @ResponseBody
    public User findOne(@PathVariable("id") String id ) throws Exception {
        Future<User> res = userService.findOne(id);
        return res.get(1000, TimeUnit.MILLISECONDS);
    }


    @RequestMapping(value = { "/user" }, method = { RequestMethod.GET })
    @ResponseBody
    public String register( @RequestParam("name") String name ) {
        userService.addUser(name);
        return "success";
    }


    @RequestMapping("/velocity")
    public String velocity( Model model ) {
        model.addAttribute("testparam", "hi boot..");
        return "index";
    }
}
