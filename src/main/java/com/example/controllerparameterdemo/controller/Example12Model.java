package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class Example12Model {


    @GetMapping("/example12")
    public String example12Model(Map<String,String> map){
        map.put("streetName","Dream Land");
        map.put("zipCode","11111");
        map.put("city","Yangon");
        return "address";
    }
    @GetMapping("/example12-V1")
    public String exampleModelMap(ModelMap map){
        map.put("streetName","Buttery Bridge Street");
        map.put("zipCode","11144");
        map.put("city","New York");
        return "address";
    }

    @GetMapping("/example12-V3")
    public String exampleModel(Model model){
        model.addAttribute("streetName", "79 Park Avenue");
        model.addAttribute("zipCode","77777");
        model.addAttribute("city","India");

        return "address";
    }


    @GetMapping("/example12-V4")
    public ModelAndView exampleModelAndView(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("streetName","Strand Road");
        mv.addObject("zipCode","55555");
        mv.addObject("city","Yangon");
        mv.setViewName("address");
        return mv;
    }


}
