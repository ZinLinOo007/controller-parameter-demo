package com.example.controllerparameterdemo.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example07HttpMethod {
    @ResponseBody
    @RequestMapping("/example07")
    public String example07(HttpMethod httpMethod){
        return String.format(
                "HttpMethod::[%s]",httpMethod
        );
    }
}
