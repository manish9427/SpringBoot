package com.example.SpringBoot.errorhandling;

public class NullPointerException {
    public static void main(String[] args) {
        try{
            String str = null;
            String result = str + "abc"; // null is treated as "null" in string operations
            System.out.println(result);
            System.out.println(str.length());
        }catch (Exception e){
            System.out.println("Caught a general exception: " + e);
        }

    }
}
