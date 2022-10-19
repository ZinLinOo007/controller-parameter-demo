package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Example13RedirectAttribute {
    @GetMapping("/example13")
    public String example13Redirect(Model model, RedirectAttributes attributes){
        model.addAttribute("name","Thuza");
        model.addAttribute("hobby","Reading");
        model.addAttribute("name1","Lwin Lwin Thant");
        model.addAttribute("hobby1","Swimming");

        return "forward:/example13-v1";
    }

    @GetMapping("/example13-v1")
    public String example13(Model model){
        // model.addAttribute("name1",model.getAttribute("name1"));
         //model.addAttribute("hobby1",model.getAttribute("hobby1"));

        return "info";
    }
}
