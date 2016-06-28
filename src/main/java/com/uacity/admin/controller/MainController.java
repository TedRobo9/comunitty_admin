package com.uacity.admin.controller;

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


    @RequestMapping
    @ResponseBody
    public String index() {
        return "login";
    }



    @RequestMapping(value = { "/user" }, method = { RequestMethod.GET })
    @ResponseBody
    public String register( @RequestParam("name") String name ) {
        return "login";
    }


    @RequestMapping("/velocity")
    public String velocity( Model model ) {
        model.addAttribute("testparam", "hi boot..");
        return "index";
    }
}
