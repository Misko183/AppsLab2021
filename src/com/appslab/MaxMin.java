package com.appslab;


public class MaxMin {
    public static void findMinAndMax(int[] A)
    {
        // initialize minimum and maximum element with the first element
        int max = A[0];
        int min = A[0];

        // do for each array element
        for (int i = 1; i < A.length; i++)
        {
            // if the current element is greater than the maximum found so far
            if (A[i] > max) {
                max = A[i];
            }

            // if the current element is smaller than the minimum found so far
            else if (A[i] < min) {
                min = A[i];
            }
        }

        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }

    public static void main(String[] args)
    {
        int[] A = { 10, 4, 1, 4, -10, -50, 32, 21 };

        // find the minimum and maximum element, respectively
        findMinAndMax(A);
    }
}
