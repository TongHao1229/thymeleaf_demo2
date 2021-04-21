package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JudgeThymeleafController {

    @GetMapping("/judge")
    public String judge(Model model){
        // 字符串
        model.addAttribute("flag","fail");
        // 布尔类型
        model.addAttribute("isRight",true);
        // Integer
        model.addAttribute("num",3);
        return "judge";
    }
}
