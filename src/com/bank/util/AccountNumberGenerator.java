package com.bank.util;

public class AccountNumberGenerator {
    private static int savingsCounter = 1001;
    private static int currentCounter = 1001;

    private AccountNumberGenerator(){}

    public static String generateSavingsAccountNumber(){
        return "SA" + savingsCounter++;
    }

    public static String generateCurrentAccountNumber(){
        return "CA" + currentCounter++;
    }
}
