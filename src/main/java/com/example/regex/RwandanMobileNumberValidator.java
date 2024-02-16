package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RwandanMobileNumberValidator {
    private static final String RWANDAN_MOBILE_REGEX = "(07\\d{8})|(\\+2507\\d{8})";

    public static void main(String[] args) {
        String phoneNumber = "0781234567"; // Change to the number you want to validate
        if (isValidRwandanMobileNumber(phoneNumber)) {
            if (phoneNumber.startsWith("07")) {
                System.out.println("Local number format");
            } else if (phoneNumber.startsWith("+2507")) {
                System.out.println("International number format");
            }
        } else {
            System.out.println("Invalid Rwandan mobile telephone number");
        }
    }

    public static boolean isValidRwandanMobileNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(RWANDAN_MOBILE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}

