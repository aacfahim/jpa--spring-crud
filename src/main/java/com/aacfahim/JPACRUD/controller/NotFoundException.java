package com.aacfahim.JPACRUD.controller;

public class NotFoundException extends RuntimeException{
    /**
     * The StudentNotFoundException function is a constructor that takes in a String message and passes it to the superclass.
     *
     *
     * @param String message Pass a message to the superclass constructor
     *
     * @return The message
     *
     * @docauthor Trelent
     */
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }
}
