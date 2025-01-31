package com.example.SpringBoot.controller;

public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }

    public void greet(){
        System.out.println("Name: "+ name);
    }
}
