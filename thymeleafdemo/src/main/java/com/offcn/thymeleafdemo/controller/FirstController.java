package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

        @GetMapping("/first")
    public String index(Model model){
           model.addAttribute("msg","cl陈龙最爱大宝剑");

            return "index";
        }

}
