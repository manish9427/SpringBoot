package com.example.SpringBoot.errorhandling;

public class ArithmeticException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This causes an ArithmeticException
            System.out.println(result);
        }catch (Exception e) { // Generic exception handler
            System.out.println("Caught a general exception: " + e);
        }  finally {
            System.out.println("Finally block executed, cleaning up resources.");
        }
    }
}
