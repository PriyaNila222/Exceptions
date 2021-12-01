package com.company;

public class CustomException extends Exception{
    public CustomException() {
        super("Insufficient balance in your account");
    }

    public CustomException(String message) {
        super(message);
    }
}
