package com.pedrohrocha.todolistapi.service;

import com.pedrohrocha.todolistapi.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TodoService {
    List<Task> tasks = new ArrayList<>();

    public Task createTask(Task task) {
        task.setId(UUID.randomUUID().toString());
        tasks.add(task);
        return task;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
