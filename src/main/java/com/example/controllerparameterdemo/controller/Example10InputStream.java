package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
public class Example10InputStream {
    // curl -X POST -H "Content-Type : application/octet-stream" -d '{"my octet string"}' localhost:8080/example10
    @RequestMapping("/example10")
    @ResponseBody
    public void example10(InputStream inputStream, OutputStream outputStream)throws IOException {
        inputStream.transferTo(outputStream);
        outputStream.write(10);
    }
}
