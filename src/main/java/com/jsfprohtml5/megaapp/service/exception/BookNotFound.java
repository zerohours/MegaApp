package com.jsfprohtml5.megaapp.service.exception;

public class BookNotFound extends Exception {

    public BookNotFound() {
        this.message = "Book not found";
    }

    public BookNotFound(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    private String message;
}
