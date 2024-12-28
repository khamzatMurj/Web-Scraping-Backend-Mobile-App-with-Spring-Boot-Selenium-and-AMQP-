package com.mobileappbackend.Exceptions;

public class JwtInValid extends RuntimeException{
    public JwtInValid(String message) {
        super(message);
    }
}
