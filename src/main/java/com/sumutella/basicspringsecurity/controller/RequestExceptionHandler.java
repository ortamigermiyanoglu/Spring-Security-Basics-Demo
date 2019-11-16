package com.sumutella.basicspringsecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.io.IOException;

/**
 * @author sumutella
 * @time 1:29 PM
 * @since 11/16/2019, Sat
 */

@ControllerAdvice

public class RequestExceptionHandler {
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handle(Exception ex) {
        return "404";
    }

}
