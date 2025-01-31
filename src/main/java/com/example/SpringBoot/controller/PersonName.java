package com.example.SpringBoot.controller;
//package com.example.SpringBoot.controller.Person;

import java.util.Scanner;

public class PersonName {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.nextLine();
        Person person = new Person(name);
        System.out.println("Output");
        person.greet();
    }
}
