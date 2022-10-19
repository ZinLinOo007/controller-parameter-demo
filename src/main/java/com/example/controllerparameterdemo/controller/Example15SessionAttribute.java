package com.example.controllerparameterdemo.controller;

import com.example.controllerparameterdemo.ds.Address;
import com.example.controllerparameterdemo.ds.Person;
import com.example.controllerparameterdemo.ds.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"address","person","product"})
public class Example15SessionAttribute {

    @GetMapping("/address/step1")
    public String addressForm(@ModelAttribute("address") Address address){
        return "address-flow";
    }


    @PostMapping("/address/step1")
    public String saveAddress(@ModelAttribute Address address){
        return "redirect:/person/step2";
    }

    @GetMapping("/person/step2")
    public String personForm(@ModelAttribute("person") Person person){
        return "person-flow";
    }

    @PostMapping("/person/step2")
    public String savePerson(@ModelAttribute Person person){
        return "redirect:/product/step3";
    }

    @GetMapping("/product/step3")
    public String productForm(@ModelAttribute("product") Product product){
        return "product-flow";
    }

    @PostMapping("/product/step3")
    public String saveProduct(@ModelAttribute("address")Address address,
                              @ModelAttribute("person")Person person,
                              @ModelAttribute("product")Product product, SessionStatus sessionStatus){
        System.out.println(address);
        System.out.println(person);
        System.out.println(product);
        sessionStatus.setComplete();

        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }






    @ModelAttribute("address")
    public Address address(){
        return new Address();
    }


    @ModelAttribute("person")
    public Person person(){
        return new Person();
    }


    @ModelAttribute("product")
    public Product product(){
        return new Product();
    }
}
