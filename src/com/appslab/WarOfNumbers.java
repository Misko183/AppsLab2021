package com.appslab;

import java.util.Scanner;

public class WarOfNumbers {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.println("Type your first number: ");
        int a = cs.nextInt();

        System.out.println("Type your second number: ");
        int b = cs.nextInt();

        System.out.println("Type your third number: ");
        int c = cs.nextInt();

        System.out.println("Type your fourth number: ");
        int d = cs.nextInt();


        int[] array = {a, b, c};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                even += array[i];
            }
            else{
                odd += array[i];
            }
        }

        if(even > odd){
            System.out.println("Even > Odd");
            int e = even - odd;
            System.out.println(e);
        }
        else{
            System.out.println("Odd > Even");
            int f = odd - even;
            System.out.println(f);
        }
    }
}
