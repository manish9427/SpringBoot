package com.example.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {
    @Autowired
    private Dog dog;
//    private Dog dog = new Dog();

    @GetMapping("/car")
    public String ok(){
        return dog.fun();
    }
}
