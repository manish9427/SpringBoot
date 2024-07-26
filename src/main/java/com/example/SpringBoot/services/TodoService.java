package com.example.SpringBoot.services;

import com.example.SpringBoot.models.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    public List<Todo>list = new ArrayList<>();

    public Todo create(Todo todo){
        list.add(todo);
        return todo;
    }

    public List<Todo> getAll(){
        return list;
    }
}
