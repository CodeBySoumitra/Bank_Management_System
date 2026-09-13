package com.bank;

import com.bank.exceptions.AccountNotFoundException;
import com.bank.exceptions.InsufficientFundsException;
import com.bank.exceptions.InvalidAmountException;
import com.bank.model.Account;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;
import com.bank.service.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        //OPen Accounts
        SavingsAccount acc1 = new SavingsAccount(
                "SA1001",
                "Soumitra Das",
                0.0,
                5.5);

        CurrentAccount acc2 = new CurrentAccount(
                "CA1001",
                "Ram Kumar",
                10000.0,
                2000.0);

        bank.openAccount(acc1);
        bank.openAccount(acc2);

        try {
            //Transaction
            acc1.deposit(5030);
            acc2.withdraw(1000);

            //Fund Transfer
            bank.fundTransfer(
                    "SA1001",
                    "CA1001",
                    25000
            );

            acc2.withdraw(10000);
            acc1.withdraw(15000);
        }
        catch (InvalidAmountException e){
            System.out.println("Invalid amount: "+e.getMessage());
        }
        catch (InsufficientFundsException e){
            System.out.println("Transaction Failed: "+e.getMessage());
        }
        catch (AccountNotFoundException e){
            System.out.println("Account error: "+e.getMessage());
        }
        finally {
            //Display all accounts
            System.out.println("\n========== ACCOUNT LIST ==========\n");
            bank.listAllAccount();

            //Search Account
            System.out.println("\n========== SEARCH ACCOUNT ==========\n");
            Account account = bank.findAccount("SA1001");
            if(account != null){
                account.display();
            }

            //Transaction History
            System.out.println("\n========== TRANSACTION HISTORY ==========\n");
            acc1.showTransactionHistory();
            System.out.println();
            acc2.showTransactionHistory();

            // Close Account
            System.out.println("\n========== CLOSE ACCOUNT ==========\n");
            bank.closeAccount("CA1001");

            // Remaining Accounts
            System.out.println("\n========== FINAL ACCOUNT LIST ==========\n");
            bank.listAllAccount();
        }



    }
}
