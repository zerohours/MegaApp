package com.jsfprohtml5.megaapp.service.exception;

public class BookAlreadyExists extends Exception {

    public BookAlreadyExists() {
        this.message = "Book already exists";
    }

    public BookAlreadyExists(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private String message;

}
