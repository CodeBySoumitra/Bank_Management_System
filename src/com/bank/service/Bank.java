package com.bank.service;

import com.bank.model.Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    //Acount open method
    public void openAccount(Account account){
        accounts.add(account);
        System.out.println("Account open: "+account.getAccountNumber());
    }

    //Account find method
    public Account findAccount(String accountNumber){
        for(Account acc:accounts){
            if(acc.getAccountNumber().equals(accountNumber)){
                return acc;
            }
        }
        return null;
    }

    //Close account
    public boolean closeAccount(String accountNumber){
        Account acc = findAccount(accountNumber);
        if(acc != null){
            accounts.remove(acc);
            System.out.println("Account closed: "+accountNumber);
            return true;
        }
        System.out.println("Account is not found: "+accountNumber);
        return false;
    }

    public void listAllAccount(){
        if(accounts.isEmpty()){
            System.out.println("No accounts ");
            return;
        }
        for(Account acc:accounts){
            acc.display();
            System.out.println("---");
        }
    }



}
