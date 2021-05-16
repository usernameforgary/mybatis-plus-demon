package com.personal.demo.mybatisplus.web.controller;

import com.personal.demo.mybatisplus.exception.UserNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(UserNotExistsException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, Object> handleUserNotExistException(UserNotExistsException ex) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", ex.getMessage());
        result.put("id", ex.getId());
        return result;
    }
}
