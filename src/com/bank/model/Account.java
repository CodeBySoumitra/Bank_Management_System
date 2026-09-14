package com.bank.model;

import com.bank.exceptions.AccountNotFoundException;
import com.bank.exceptions.InsufficientFundsException;
import com.bank.exceptions.InvalidAmountException;
import com.bank.interfaces.Transactable;
import com.bank.util.StringUtil;
import com.bank.util.ValidationUtil;

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


    public Account(String accountNumber, String accountHolder, double balance)
            throws InvalidAmountException, AccountNotFoundException {
        if(!ValidationUtil.isValidAccount(accountNumber)){
            throw new AccountNotFoundException("Invalid account number");
        }
        if(!ValidationUtil.isValidName(accountHolder)){
            throw new IllegalArgumentException("Invalid account Holder name");
        }
        if(balance < 0){
            throw new InvalidAmountException("Balance can't be negative");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = StringUtil.formatName(accountHolder);
        this.balance = balance;
    }

//    public Account(String accountNumber, String accountHolder)
//            throws InvalidAmountException {
//        this(accountNumber,accountHolder,0.0);
//    }

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
    public void deposit(double amount) throws InvalidAmountException{

        if(amount <= 0){
            throw new InvalidAmountException(
                    "Deposit amount must be greater than zero"
            );
        }
        adjustBalance(amount);
        addTransaction(
                LocalDateTime.now()+" | [DEPOSIT] ₹" + amount +
                        " | Balance ₹" + getBalance()
        );

    }


    public void deposit(double amount, String remark)
            throws InvalidAmountException {

        deposit(amount);
        System.out.println("Remark: "+remark);
    }

    @Override
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if(amount <= 0){
            throw new InvalidAmountException("Withdraw amount must be greater than zero");
            //System.out.println("Amount must be positive");
        }
        else if(amount > getBalance()){
            throw new InsufficientFundsException("Insufficient amount");
            //System.out.println("Insufficient balance");
        }
        else{
            adjustBalance(-amount);
            addTransaction(LocalDateTime.now()+" | [WITHDRAW] ₹" + amount +
                    " | Balance ₹" + getBalance()
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
