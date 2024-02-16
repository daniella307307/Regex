package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPasswordValidator {
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

    public static void main(String[] args) {
        String password = "Strong@Password1"; // Change to the password you want to validate
        if (isValidStrongPassword(password)) {
            System.out.println("Valid strong password");
        } else {
            System.out.println("Invalid strong password");
        }
    }

    public static boolean isValidStrongPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

