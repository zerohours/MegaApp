package com.jsfprohtml5.megaapp.service.exception;

public class BookRequestAlreadyExists extends Exception {

    public BookRequestAlreadyExists() {
        this.message = "BookRequest already exists";
    }

    public BookRequestAlreadyExists(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private String message;
}
