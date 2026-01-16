package com.pedrohrocha.todolistapi.controller;

import com.pedrohrocha.todolistapi.model.Task;
import com.pedrohrocha.todolistapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public Task create(@RequestBody Task task) {
        return todoService.createTask(task);
    }

    @GetMapping
    public List<Task> getAll() {
        return todoService.getTasks();
    }
}
