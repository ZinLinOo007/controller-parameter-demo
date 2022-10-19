package com.example.controllerparameterdemo.controller;

import com.example.controllerparameterdemo.ds.Address;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example11HttpEnity {
    // curl -X POST -H "Content-Type::application/json" -d '{"streetName":"Love Lane","zipCode":"11111","city":"Yangon"}' localhost:8080/example11

    @RequestMapping("/example11")
    @ResponseBody
    public String example11(HttpEntity<Address> entity){
        return String.format(
          "Received Address from  Host: %s and Address:: %s",
          entity.getHeaders().getHost(),
                entity.getBody()
        );
    }
}
