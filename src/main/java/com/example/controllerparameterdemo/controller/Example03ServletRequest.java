package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

@Controller
public class Example03ServletRequest {
    @ResponseBody
    @GetMapping("/example03")
    public String example03(ServletRequest request){
        return  String.format(
                "Host and Port :: [%s:%d]"
                ,request.getRemoteHost()
                ,request.getLocalPort()
        );
    }
}
