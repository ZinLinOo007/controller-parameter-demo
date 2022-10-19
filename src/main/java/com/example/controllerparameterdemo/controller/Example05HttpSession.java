package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class Example05HttpSession {

    //curl -c cookie.txt -b cookie.txt localhost:8080/example05

    @ResponseBody
    @GetMapping("/example05")
    public String example05(HttpSession httpSession){
        Integer counter = (Integer) httpSession.getAttribute("counter");
        if (counter ==null){
            httpSession.setAttribute("counter",0);
            counter = 0;
        }
        httpSession.setAttribute("counter", ++counter);
        return String.format("Counter:[%d]",httpSession.getAttribute("counter"));
    }
}
