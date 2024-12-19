package de.neuefische.springexceptionhandlingtask;

import org.springframework.http.HttpStatus;

public record ErrorMessage(HttpStatus status, String message) {
}
