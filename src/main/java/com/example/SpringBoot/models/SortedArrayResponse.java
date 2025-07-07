package com.example.SpringBoot.models;

import java.util.List;

public class SortedArrayResponse {
    private final List<Integer> sortedArray;

    public SortedArrayResponse(List<Integer> sortedArray){
        this.sortedArray=sortedArray;
    }

    public List<Integer> getSortedArray(){
        return sortedArray;
    }
}
