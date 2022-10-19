package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Controller
public class Example04ServletResponse {
    @ResponseBody
    @GetMapping("/example04")
    public void example04(ServletRequest request, ServletResponse response)throws IOException {
        response.getOutputStream().println(
                String.format("host:port:: [%s:%d]",
                        request.getRemoteHost(),
                        request.getLocalPort()
                )
        );
    }
}
