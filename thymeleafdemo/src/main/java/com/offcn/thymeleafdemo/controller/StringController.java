package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StringController {

    @GetMapping("/showString")
    public String showString(Model model){
        model.addAttribute("offcn","陈龙");
        return "string";
    }
}
