package com.example.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
    @GetMapping("/api")
    @ResponseBody
    public String sayHello(){
        return "Application Working";
    }
}
