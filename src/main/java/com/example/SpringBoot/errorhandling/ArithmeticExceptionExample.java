package com.example.SpringBoot.errorhandling;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This causes an ArithmeticException
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        }catch (Exception e) { // Generic exception handler
            System.out.println("Caught a general exception: " + e);
        }  finally {
            System.out.println("Finally block executed, cleaning up resources.");
        }
    }
}
