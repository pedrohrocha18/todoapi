package com.pedrohrocha.todolistapi.infra;

import java.time.LocalDateTime;

public record ErrorResponse(int status, String message, LocalDateTime timestamp
) { }
