package com.pedrohrocha.todolistapi.controller;

import com.pedrohrocha.todolistapi.model.Task;
import com.pedrohrocha.todolistapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin(
        origins = "https://todolistfrontspring.vercel.app/",
        methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE}
)
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task created = todoService.createTask(task);

        return ResponseEntity.status(201).body(created);
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(todoService.getTasks());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable String id, @RequestBody Task task) {
        return ResponseEntity.ok(todoService.updateTask(id, task));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable String id) {
        todoService.deleteTask(id);

        return ResponseEntity.noContent().build();
    }
}
