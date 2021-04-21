package com.offcn.thymeleafdemo.controller;

import com.offcn.thymeleafdemo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class SecondController {

    @GetMapping("/second")
    public String index(Model model){
        //对象的存储
        User user = new User(2017, "阿辉", 18, "狗中之王");
        model.addAttribute("user",user);
        //map的存储
        HashMap<String,Object> map = new HashMap();
        map.put("id","20170343139");
        map.put("name"," TH");
        map.put("address","中公优就业");
        map.put("age1","18");
        model.addAttribute("map",map);

        model.addAttribute("zhuzhu","zhuzhu.jpg");
        return "index2";
    }

}
