package com.example.SpringBoot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersModel {
    private String name;
    private String email;
    private String address;
    private long number;

}
