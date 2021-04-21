package com.offcn.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class InnerObjectController {
    @GetMapping("/innerObj")
    public String innerObj(Model model){
        //日期时间
        Date date = new Date();
        model.addAttribute("date",date);
        //数值
        double num = 123456.789123;
        model.addAttribute("num",num);
        //大文本
        String str = "JVM（Java Virtual Machine）是整个 java 实现跨平台的最核心的部分，不同的操作系统上安装了不同版本的JVM虚拟机，营造出相同的Java运行环境，屏蔽了底层操作系统的不同。";
        model.addAttribute("str",str);

        return "innerObj";

    }
}
