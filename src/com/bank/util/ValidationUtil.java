package com.bank.util;


public class ValidationUtil {
    private  ValidationUtil(){}

    //validating name
    public static boolean isValidName(String name){
        return name != null && name.matches("[A-Za-z ]+");
    }
    //validating account no.
    public static boolean isValidAccount(String acc){
        return acc != null && acc.matches("(SA|CA)\\d+");
    }
    //validating amount
    public static boolean isValidAmount(double amount){
        return amount > 0;
    }

}
