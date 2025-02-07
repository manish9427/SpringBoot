package com.example.SpringBoot.javaBasic;

class CarFeture {
    String brand;
    int speed;
    CarFeture (String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }
}

public class Car{
    public static void main (String args[]){
        CarFeture myCar =new CarFeture("Toyota",100);
        System.out.println(myCar.brand +" "+ myCar.speed);
    }
}
