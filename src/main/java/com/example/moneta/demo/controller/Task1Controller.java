package com.example.moneta.demo.controller;

import com.example.moneta.demo.service.Task1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task1Controller {
    private final Task1Service taskService;

    @Autowired
    public Task1Controller(Task1Service taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/transform")
    public String transformInput(@RequestBody String input){
        return taskService.transformString(input);
    }
}
