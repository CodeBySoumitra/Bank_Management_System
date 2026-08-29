package com.bank;

import com.bank.model.Account;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;
import com.bank.service.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.openAccount(new SavingsAccount("SA1001", "Soumitra Das", 0.0, 5.5));
        bank.openAccount(new CurrentAccount("CA1002","Ram Kumar",10000.0, 2000.0));

        bank.listAllAccount();

        Account found = bank.findAccount("CA1002");
        if(found != null){
            found.deposit(500);
        }

        bank.closeAccount("SA1001");
        bank.listAllAccount();



















//        SavingsAccount s1 = new SavingsAccount("SA1001", "Soumitra Das", 0.0, 5.5);
//        CurrentAccount c1 = new CurrentAccount("CA1002","Ram Kumar",10000.0, 2000.0);
//        System.out.println("----- Saving Account -----");
//        s1.deposit(2000,"salary credited");
//        System.out.println("Interset amount: "+s1.calculateInterest());
//        s1.display();
//
//        System.out.println("\n----- Current Account -----");
//        c1.withdraw(11000);
//        c1.display();
//        System.out.println("Interest: "+c1.calculateInterest());
//
//        c1.withdraw(1000);
//        c1.display();
//
//        c1.withdraw(1000);
//        c1.display();

        //Account is an abstract class can not be initiated.
        //Account a = new Account("m", "122",20.24);



    }
}
