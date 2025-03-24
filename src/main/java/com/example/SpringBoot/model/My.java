package com.example.SpringBoot.model;

public class My {
    private int id;
    private String  name;
    private String email;

    public My(int id, String name,String email){
        this.id = id;
        this.name=name;
        this.email=email;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

}
