package com.appslab;

import java.util.Random;
import java.util.Scanner;

public class MultiplyByLegth {

    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        System.out.println("Select first number:");
        int a = cc.nextInt();

        System.out.println("Select second number:");
        int b = cc.nextInt();

        System.out.println("Select third number:");
        int c = cc.nextInt();

        System.out.println("Select fourth number:");
        int d = cc.nextInt();

        int array1[] = {a, b, c, d};
        for(int i = 0; i < array1.length; i++){
            System.out.println(array1[i] * array1.length);
        }
    }
}
