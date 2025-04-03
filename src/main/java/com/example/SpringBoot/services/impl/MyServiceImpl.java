package com.example.SpringBoot.services.impl;

import com.example.SpringBoot.models.My;
import com.example.SpringBoot.services.MyService;
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
