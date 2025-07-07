package com.example.SpringBoot.controllers;

import com.example.SpringBoot.models.SortedArrayResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/req")

public class ApiController {
    int arr [] = {4,9,3,8,5};
    @GetMapping("/sort")
    public SortedArrayResponse sortArray(){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        List<Integer> sortedList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return new SortedArrayResponse(sortedList);
    }
}
