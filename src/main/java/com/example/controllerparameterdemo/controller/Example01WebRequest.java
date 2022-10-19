package com.example.controllerparameterdemo.controller;

import com.example.controllerparameterdemo.util.JoinUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Example01WebRequest {

    @ResponseBody
    @GetMapping("/example01")
    public String example01(WebRequest webRequest){
        return String.format(
                "WebRequestHeaders : %s :: ParametersName: %s \n"
                , JoinUtil.join(webRequest.getHeaderNames()),
                JoinUtil.join(webRequest.getParameterNames())
        );
    }
}
