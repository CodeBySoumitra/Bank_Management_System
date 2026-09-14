package com.bank.model;

import com.bank.exceptions.AccountNotFoundException;
import com.bank.exceptions.InvalidAmountException;
import com.bank.util.AccountNumberGenerator;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber,
                          String accountHolder,
                          double balance,
                          double interestRate) throws InvalidAmountException, AccountNotFoundException {

        super(accountNumber,accountHolder,balance);
        this.interestRate = interestRate;
    }


    public double getInterestRate(){
        return interestRate;
    }


    public double calculateInterest(){
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Account Type  : Savings");
        System.out.println("Interest Rate : "+getInterestRate()+"%");
    }
}
