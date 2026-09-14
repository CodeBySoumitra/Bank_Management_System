package com.bank.model;

import com.bank.exceptions.AccountNotFoundException;
import com.bank.exceptions.InvalidAmountException;

import java.util.Base64;

public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit)
            throws InvalidAmountException, AccountNotFoundException {
        super(accountNumber,accountHolder,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    @Override//logic for minimum amount must be in current account
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Withdraw Amount must be positive");
            return;
        }
        else if(amount > getBalance()+overdraftLimit){
            System.out.println("Withdrawal exceeds overdraft limit.");
            return;
        }
        adjustBalance(-amount);
        System.out.println("Withdraw: "+amount+" Updated balance: "+getBalance());
    }

    @Override
    public double calculateInterest(){
        return 0.0;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Account Type   : Current");
        System.out.println("Overdraft Limit: ₹" + getOverdraftLimit());
    }

}
