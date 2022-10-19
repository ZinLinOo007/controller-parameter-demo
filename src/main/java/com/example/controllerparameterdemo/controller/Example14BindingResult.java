package com.example.controllerparameterdemo.controller;

import com.example.controllerparameterdemo.ds.Address;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Example14BindingResult {

    @GetMapping("/create-address")
    public String addressForm(@ModelAttribute Address address){
        return "address-form";
    }

    @PostMapping("/create-address")
    public String saveAddress(@ModelAttribute @Valid Address address, BindingResult result, RedirectAttributes redirectAttributes){
            if (result.hasErrors()){
                return "address-form";
            }
        System.out.println(address);
            list.add(address);
            redirectAttributes.addFlashAttribute(address);


            return "redirect:/show-address";
    }
    @GetMapping("/show-address")
    public String listAddress(@ModelAttribute Address address, Model model){
        model.addAttribute("streetName",address.getStreetName());
        model.addAttribute("zipCode",address.getZipCode());
        model.addAttribute("city",address.getCity());
        return "show-address";
    }

    public List<Address> list = new ArrayList<>();
    @ModelAttribute("addressList")
    public List<Address> methodModelAttribute(){
        return  list;
    }

}
