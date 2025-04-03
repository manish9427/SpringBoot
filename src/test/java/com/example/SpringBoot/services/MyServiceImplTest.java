package com.example.SpringBoot.services;

import com.example.SpringBoot.models.My;
import com.example.SpringBoot.services.impl.MyServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Slf4j
@ExtendWith(MockitoExtension.class)
class MyServiceImplTest {

    @InjectMocks
    private MyServiceImpl myService;

    @Test
    void testGetMyList() {
        List<My> mockUsers = Arrays.asList(
                new My(1, "Manish", "manish119427@gmail.com"),
                new My(2, "Jane Doe", "jane@example.com"),
                new My(3, "Bob", "bob.smith@email.net")
        );

        List<My> result = myService.getMyList();

        assertEquals(mockUsers.size(), result.size(),"Fields are not same Passed");
        assertEquals(mockUsers.get(0).getName(), result.get(0).getName());
    }
}
