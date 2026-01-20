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

    public Task updateTask(String id, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setCompleted(updatedTask.isCompleted());
                return task;
            }
        }
        throw new RuntimeException("Não foi encontrada uma tarefa para esse ID!");
    }

    public void deleteTask(String id) {
        boolean removed = tasks.removeIf(task -> task.getId().equals(id));

        if (!removed) throw new RuntimeException("Tarefa não encontrada.");
    }
}
