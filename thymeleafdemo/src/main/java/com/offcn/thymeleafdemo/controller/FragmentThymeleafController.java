package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentThymeleafController {
    @GetMapping("/useFrag")
    public String usefrag(){
        return "useFrag";
    }
}
