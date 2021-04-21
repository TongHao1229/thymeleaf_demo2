package com.offcn.thymeleafdemo.controller;

import com.offcn.thymeleafdemo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {

    @GetMapping("/showList")
    public String showList(Model model){
        List list = new ArrayList();
        list.add(new User(12,"小白1",18,"北京顺义"));
        list.add(new User(13,"小白2",19,"北京昌平"));
        list.add(new User(14,"小白3",15,"北京海淀"));
        list.add(new User(15,"小白4",154,"北京朝阳"));
        model.addAttribute("list",list);
        return "index3" ;
    }

}
