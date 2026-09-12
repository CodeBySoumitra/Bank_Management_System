package com.bank.model;

import com.bank.interfaces.Transactable;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;


public abstract class Account implements Transactable {
    private final String accountNumber;
    private String accountHolder;
    private double balance;

    private final ArrayList<String> transactionHistory = new ArrayList<>();

    public void addTransaction(String transaction){
        transactionHistory.add(transaction);
    }

    //show transaction history
    public void showTransactionHistory() {

        System.out.println("\n========================================");
        System.out.println("TRANSACTION HISTORY : " + accountNumber);
        System.out.println("========================================");

        if(transactionHistory.isEmpty()){
            System.out.println("No transactions found.");
            return;
        }

        transactionHistory.forEach(System.out::println);

        System.out.println("========================================");
    }

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

    protected void adjustBalance(double delta){
        balance += delta;
    }

    @Override
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Amount must be positive");
            return;
        }
        adjustBalance(amount);
        addTransaction(
                LocalDateTime.now()+" | Deposited "+amount+" Balance "+getBalance()
        );
        //System.out.println("Deposit amount: "+amount+" Total balance: "+balance);
    }


    public void deposit(double amount, String remark){
        deposit(amount);
        System.out.println("Remark: "+remark);
    }

    @Override
    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Amount must be positive");
        }
        else if(amount > getBalance()){
            System.out.println("Insufficient balance");
        }
        else{
            adjustBalance(-amount);
            addTransaction(LocalDateTime.now()+" | withdraw "+amount+" Balance: "+getBalance()
            );
        }
    }

    public abstract double calculateInterest();

    public void display() {
        System.out.println("""
            ============================
                  ACCOUNT DETAILS
            ============================
            Account No   : %s
            Holder Name  : %s
            Balance      : ₹%.2f
            ============================
            """.formatted(
                accountNumber,
                accountHolder,
                balance
        ));
    }
}
