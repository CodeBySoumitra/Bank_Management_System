package com.bank.model;

public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Account(String accountNumber, String accountHolder){
        this(accountNumber,accountHolder,0.0);
    }

    //getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    //setters
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Amount must be positive");
        }
        balance += amount;
        System.out.println("Deposit amount: "+amount+" Total balance: "+balance);
    }

    public void deposit(double amount, String remark){
        deposit(amount);
        System.out.println("Remark: "+remark);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Amount must be positive");
        }
        else if(amount > getBalance()){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("withdraw amount : "+amount+" Updated balance: "+balance);
        }
    }

    public double calculateInterest(){
        return 0.0;
    }

    public void display(){
        System.out.println("Account Number: "+accountNumber+"\nAccount Holder Name: "+accountHolder+"\nBalance: "+balance);
    }
}
