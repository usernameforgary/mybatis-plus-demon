package com.personal.demo.mybatisplus.exception;

public class UserNotExistsException extends RuntimeException {
    private String id;

    public UserNotExistsException(String id) {
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

