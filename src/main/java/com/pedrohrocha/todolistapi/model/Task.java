package com.pedrohrocha.todolistapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Task {
    private String id;
    private String title;
    private String description;
    private boolean completed = false;
}
