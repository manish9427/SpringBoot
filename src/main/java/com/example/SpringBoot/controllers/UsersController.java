package com.example.SpringBoot.controllers;

import com.example.SpringBoot.models.UsersModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsersController {
    @GetMapping("/age")
    public ResponseEntity<UsersModel> getUserDetails() {
        UsersModel user = new UsersModel("Manish", "manish@example.com", "Bengaluru", 1234567890L);
        return ResponseEntity.ok(user);
    }
}
