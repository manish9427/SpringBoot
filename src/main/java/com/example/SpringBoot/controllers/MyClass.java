package com.example.SpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
//    @GetMapping(path="/hello")
//    @GetMapping("/hello")
    @GetMapping("hello")
    public String sayHello(){
        return "Hello World";
    }
}
