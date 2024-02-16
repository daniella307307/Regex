package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMain {
    public static void main(String[] args){
        Pattern p=Pattern.compile("ca");
        Matcher m=p.matcher("rca");

        boolean b=m.matches();
        boolean b2=Pattern.compile(".rca").matcher("rca").matches();
        boolean b3=Pattern.matches(".ca","rca");
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b);
    }
}
