package com.example.SpringBoot.errorhandling;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String str = null;
            String result = str + "abc"; // null is treated as "null" in string operations
            System.out.println(result);
            System.out.println(str.length()); // Causes NullPointerException
        }catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }catch (Exception e){
            System.out.println("Caught a general exception: " + e);
        }finally {
            System.out.println("Finally block executed, cleaning up resources.");
        }

    }
}
