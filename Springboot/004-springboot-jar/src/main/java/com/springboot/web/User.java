package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class User {
    @RequestMapping(value="/user/json/detail")
    public @ResponseBody Object userjsondetail(){
        Map<String,Object> rerMap=new HashMap<String, Object>();
        rerMap.put("id",1001);
        rerMap.put("username","www");

        return rerMap;

    }
    @RequestMapping(value="user/page/detail")
    public String userpagedetali(Model model){
        model.addAttribute("id",1002);
        model.addAttribute("username","qqq");

        return "userDetail";
    }
}
