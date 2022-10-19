package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class Example06Principle {
    @ResponseBody
    @GetMapping("/example06")
    public String example06(Principal principal){

        return String.format(
                "Authenticated UserName:[%s]",principal.getName()
        );
    }
}
