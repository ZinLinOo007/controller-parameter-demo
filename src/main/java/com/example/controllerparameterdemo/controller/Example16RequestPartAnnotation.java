package com.example.controllerparameterdemo.controller;

import com.example.controllerparameterdemo.util.InMemoryStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;

@Controller
public class Example16RequestPartAnnotation {

    @Autowired
    private InMemoryStorage inMemoryStorage;


    @GetMapping("/example16/gallary")
    public String example16(Model model){
        model.addAttribute("imagesNames", inMemoryStorage.getName());
        return "gallary";
    }


    @GetMapping(value = "/example16/gallary/{imageName}", produces = MediaType.IMAGE_GIF_VALUE)
    @ResponseBody
    public byte[] showImage(@PathVariable String imageName){
        return inMemoryStorage.getByName(imageName);
    }

    @PostMapping("/example16/gallary")
    public String fileUpload(@RequestPart("file")MultipartFile file)throws IOException {
        inMemoryStorage.store(file.getOriginalFilename(), file.getBytes());
        return "redirect:/example16/gallary";
    }

}
