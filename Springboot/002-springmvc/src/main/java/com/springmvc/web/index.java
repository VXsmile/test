package com.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {

    @RequestMapping(value="/com.springmvc/say")
    public @ResponseBody String say(){
        return "Hellow Springboot";
    }
}
