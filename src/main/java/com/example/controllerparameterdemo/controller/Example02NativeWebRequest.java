package com.example.controllerparameterdemo.controller;

import com.example.controllerparameterdemo.util.JoinUtil;
import org.apache.catalina.connector.RequestFacade;
import org.apache.catalina.connector.ResponseFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.NativeWebRequest;

import java.io.IOException;

@Controller
public class Example02NativeWebRequest {
    @ResponseBody
    @GetMapping("/example02")
    public void example02(NativeWebRequest webRequest)throws IOException {
      RequestFacade request =  webRequest.getNativeRequest(RequestFacade.class);
        ResponseFacade response = webRequest.getNativeResponse(ResponseFacade.class);

        response.getOutputStream().println(
               String.format("Request Headers: %s , Request Parameter: %s", JoinUtil.join(request.getHeaderNames()),
                       JoinUtil.join(request.getParameterNames()))

        );
    }
}
