package com.bank.service;

import com.bank.model.Account;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bank {
        private final ArrayList<Account> accounts;

        public Bank(){
            accounts = new ArrayList<>();
        }

        //Account open method
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
        public void closeAccount(String accountNumber){
            Account acc = findAccount(accountNumber);
            if(acc != null){
                accounts.remove(acc);
                System.out.println("Account closed: "+accountNumber);
                return;
            }
            System.out.println("Account is not found: "+accountNumber);
        }

        //list of all account
        public void listAllAccount(){
//            if(accounts.isEmpty()){
//                System.out.println("No accounts ");
//                return;
//            }
//            for(Account acc:accounts){
//                acc.display();
//                System.out.println("---");
//            }
            System.out.println("\n------------------------------------------------");
            System.out.printf("%-10s %-20s %-15s%n",
                    "ACC NO",
                    "HOLDER",
                    "BALANCE");
            System.out.println("------------------------------------------------");

            for(Account acc : accounts){
                acc.display();
            }

            System.out.println("------------------------------------------------");
        }


        //fund transfer
        public void fundTransfer(String fromAccount,
                                 String toAccount,
                                 double amount){
            Account sender = findAccount(fromAccount);
            Account receiver = findAccount(toAccount);

            if(sender == null || receiver == null){
                System.out.println("no account found");
                return;
            }

            if(amount <= 0 || sender.getBalance()<0){
                System.out.println("Invalid amount");
                return;
            }

            sender.withdraw(amount);
            receiver.deposit(amount);

            sender.addTransaction(
                    LocalDateTime.now()+" | Transferred ₹"+amount+" to "+receiver.getAccountNumber()
            );

            receiver.addTransaction(
                    LocalDateTime.now()+" | Received ₹"+amount+" from "+sender.getAccountNumber()
            );

            System.out.println("Transfer Successful");
        }
}
