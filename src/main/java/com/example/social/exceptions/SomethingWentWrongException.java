package com.example.social.exceptions;

public class SomethingWentWrongException extends RuntimeException{
    public SomethingWentWrongException(String msg){
        super(msg);
    }
}
