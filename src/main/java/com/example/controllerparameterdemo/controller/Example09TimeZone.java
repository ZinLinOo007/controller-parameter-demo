package com.example.controllerparameterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZoneId;
import java.util.TimeZone;

@Controller
public class Example09TimeZone {
    @ResponseBody
    @GetMapping("/example09")
    public String example09(TimeZone timeZone, ZoneId zoneId){
        return String.format(
                "TimeZone :: [%s], ZoneId :: [%s]", timeZone.getDisplayName(), zoneId.getId()
        );
    }
}
