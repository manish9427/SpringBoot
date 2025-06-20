package com.example.SpringBoot.model;

public class AdditionResponse {
    private double result;

    public AdditionResponse(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
