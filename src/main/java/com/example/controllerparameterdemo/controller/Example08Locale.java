package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class Example08Locale {

    //curl -H "Accept-Language: en" localhost:8080/example08"
    @RequestMapping("/example08")
    @ResponseBody
    public String example08(Locale locale){
        return String.format(
          "Current Locale::[%s]", locale.getDisplayName()
        );
    }
}
