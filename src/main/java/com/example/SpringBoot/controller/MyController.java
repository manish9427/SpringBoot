package com.example.SpringBoot.controller;

import com.example.SpringBoot.model.My;
import com.example.SpringBoot.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/my")
public class MyController {
    private MyService myService;

    public MyController(MyService myService){
        this.myService = myService;
    }

    @GetMapping
    public List<My> getMyList(){
        return myService.getMyList();
    }

}
