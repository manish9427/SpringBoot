package com.example.SpringBoot.service.impl;

import com.example.SpringBoot.model.My;
import com.example.SpringBoot.service.MyService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public List<My> getMyList() {
        return Arrays.asList(
                new My(1, "Manish", "manish119427@gmail.com"),
                new My(2, "Alice", "alice@example.com"),
                new My(3, "Bob", "bob.smith@email.net")
        );
    }
}
