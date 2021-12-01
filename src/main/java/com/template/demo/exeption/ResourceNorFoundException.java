package com.template.demo.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNorFoundException extends RuntimeException {
    public ResourceNorFoundException(String message) {
        super(message);
    }
}
