package com.appslab;

public class Equality {

    public int equalsNumbers(int a, int b, int c) {
        int d = 0;

        if (a == b) {
            d++;
        }
        if (a == c) {
            d++;
        }
        if (b == c) {
            d++;
        }
        if (d == 1 ) {
            d = 2;
        }
        return d;
    }
}