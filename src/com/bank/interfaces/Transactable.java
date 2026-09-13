package com.bank.interfaces;

import com.bank.exceptions.InsufficientFundsException;
import com.bank.exceptions.InvalidAmountException;

public interface Transactable {
    void deposit(double amount)
            throws InvalidAmountException;
    void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException;
}
