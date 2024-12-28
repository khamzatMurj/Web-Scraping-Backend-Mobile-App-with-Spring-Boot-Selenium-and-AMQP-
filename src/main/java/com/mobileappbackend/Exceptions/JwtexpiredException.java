package com.mobileappbackend.Exceptions;

public class JwtexpiredException extends RuntimeException{
    public JwtexpiredException(String message) {
        super(message);
    }
}
