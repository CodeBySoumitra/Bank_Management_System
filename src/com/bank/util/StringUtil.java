package com.bank.util;

public class StringUtil {
    private StringUtil(){}

    public static String formatName(String name){
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");
        StringBuilder formatted = new StringBuilder();
        for(String word : words){
            formatted.append(
                     Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return formatted.toString().trim();
    }
}
