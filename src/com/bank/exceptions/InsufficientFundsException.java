package com.bank.exceptions;

public class InsufficientFundsException extends Throwable{
    public InsufficientFundsException(String message){
        super(message);
    }
}
