package com.example.SpringBoot.controller;

import com.example.SpringBoot.models.Todo;
import com.example.SpringBoot.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public Todo createTodo(@RequestBody Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    public List<Todo> getAll(){
        return todoService.getAll();
    }
}
