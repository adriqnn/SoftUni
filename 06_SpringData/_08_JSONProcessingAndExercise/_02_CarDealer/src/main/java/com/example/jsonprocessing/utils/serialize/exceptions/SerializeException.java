package com.example.jsonprocessing.utils.serialize.exceptions;

public class SerializeException extends RuntimeException {

    public SerializeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SerializeException(String message) {
        super(message);
    }
}
