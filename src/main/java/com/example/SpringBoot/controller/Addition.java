package com.example.SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Addition {
    @GetMapping("/add")
    @ResponseBody
    public int add(@RequestParam int a,@RequestParam int b){
        return a+b;
    }
    @GetMapping("/sub")
    @ResponseBody
    public int sub(@RequestParam int a,@RequestParam int b){
        return a-b;
    }
}
