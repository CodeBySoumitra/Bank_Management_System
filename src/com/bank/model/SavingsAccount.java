package com.bank.model;

public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber,accountHolder,balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double calculateInterest(){
        return getBalance() * (interestRate / 100);
    }
}
