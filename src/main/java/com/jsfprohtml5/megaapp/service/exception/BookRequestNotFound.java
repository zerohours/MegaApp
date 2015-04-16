package com.jsfprohtml5.megaapp.service.exception;

public class BookRequestNotFound extends Exception {

    public BookRequestNotFound() {
        this.message = "BookRequest not found";
    }

    public BookRequestNotFound(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private String message;
}
