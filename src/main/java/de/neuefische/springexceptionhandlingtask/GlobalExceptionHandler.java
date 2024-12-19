package de.neuefische.springexceptionhandlingtask;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ErrorMessage handleGlobalException(Exception ex) {
        return new ErrorMessage(HttpStatus.BAD_REQUEST, "An error occurred \uD83D\uDE40 " + ex.getMessage());
    }
}
