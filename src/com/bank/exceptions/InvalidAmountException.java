package com.bank.exceptions;

public class InvalidAmountException extends Throwable {
    public InvalidAmountException(String message){
        super(message);
    }
}
