package com.appslab;

import java.util.Scanner;

public class Pie {

    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        System.out.println("Number of pieces of cake:");
        int NumOfPieces = cc.nextInt();

        System.out.println("Number of people:");
        int NumOfRecipients = cc.nextInt();

        System.out.println("Number of pieces for person:");
        int NumOfPiecesPerPerson = cc.nextInt();

        if (NumOfRecipients*NumOfPieces <= NumOfPiecesPerPerson) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

