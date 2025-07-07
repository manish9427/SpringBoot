package com.example.SpringBoot.controllers;

import com.example.SpringBoot.models.AdditionRequest;
import com.example.SpringBoot.models.AdditionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping("/api")
public class AdditionController {
    private static final Logger log = LoggerFactory.getLogger(AdditionController.class);

    @Value("${testkey}")
    private String testValue;

    @PostMapping("/add")
    public ResponseEntity<?> addNumbers(@RequestBody AdditionRequest request) {

        log.info("Value of testkey: {}", testValue);
        try {
            if (request.getNum1() == null || request.getNum2() == null) {
                return ResponseEntity.badRequest().body("Both num1 and num2 are required");
            }


            double result = request.getNum1() + request.getNum2();

            log.trace("Result {} logged in at {}", result, Instant.now());

            return ResponseEntity.ok(new AdditionResponse(result));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Internal server error");
        }
    }
}
