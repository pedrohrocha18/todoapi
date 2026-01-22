package com.pedrohrocha.todolistapi.exceptions;

public class TodoExceptions extends RuntimeException {

    public TodoExceptions() {
    }

    public TodoExceptions(String message) {
        super(message);
    }
}
