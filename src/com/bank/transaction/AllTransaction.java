//package com.bank.transaction;
//
//import java.util.ArrayList;
//import com.bank.model.Account;
//
//public class AllTransaction {
//    private final ArrayList<String> transactionHistory = new ArrayList<>();
//
//    public void addTransaction(String transaction){
//        transactionHistory.add(transaction);
//    }
//
//    //show transaction history
//    public void showTransactionHistory() {
//
//        System.out.println("\n========================================");
//        System.out.println("TRANSACTION HISTORY : " + Account.accountNumber);
//        System.out.println("========================================");
//
//        if(transactionHistory.isEmpty()){
//            System.out.println("No transactions found.");
//            return;
//        }
//
//        transactionHistory.forEach(System.out::println);
//
//        System.out.println("========================================");
//    }
//}
