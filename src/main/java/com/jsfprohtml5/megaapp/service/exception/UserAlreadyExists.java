package com.jsfprohtml5.megaapp.service.exception;

public class UserAlreadyExists extends Exception {

    public UserAlreadyExists() {
        this.message = "User al ready exists";
    }

    public UserAlreadyExists(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private String message;
}
