package com.example.SpringBoot.errorhandling;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try{
            String text = "Hello";
            int number = 5;
            String result = text + number; // String concatenation occurs
            System.out.println(result);
            int num = Integer.parseInt(text); // Causes NumberFormatException
            System.out.println(num);
        }catch (NumberFormatException e) { // No conflict now!
            System.out.println("Invalid number format: " + e);
        } catch (Exception e) { // Generic exception handler
            System.out.println("Caught a general exception: " + e);
        }finally {
            System.out.println("Finally block executed, cleaning up resources.");
        }
    }
}
