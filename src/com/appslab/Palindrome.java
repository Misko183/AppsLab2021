package com.appslab;

import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(String str){
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner cc = new Scanner(System.in);

        System.out.println("Palindrome- write word:");
        String str = cc.nextLine();

        System.out.println("Result:" + isPalindrome(str));
    }
}

