package com.bank;

import com.bank.model.Account;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("SA1001", "Soumitra Das", 0.0, 5.5);
        CurrentAccount c1 = new CurrentAccount("CA1002","Ram Kumar",10005.2, 2000.0);
        s1.deposit(2000,"salary credited");
        s1.display();
        System.out.println("Interest Rate: "+s1.getInterestRate());
        System.out.println("Interset amount"+s1.calculateInterest());

        c1.withdraw(15000);
        c1.display();
        System.out.println("Minimum balance: "+c1.getOverdraftLimit());

    }
}
