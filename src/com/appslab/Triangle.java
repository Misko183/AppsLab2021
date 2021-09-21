package com.appslab;

public class Triangle {

    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=3;

        int truth=0;

        if (a+b<=c){
            truth=truth+1;
        }
        if (a+c<=b){
            truth=truth+1;
        }
        if (c+b<=a){
            truth=truth+1;
        }
        if (truth>=1){
            System.out.println("false");
        }
        else if (truth==0){
            System.out.println("true");
        }

    }
}
