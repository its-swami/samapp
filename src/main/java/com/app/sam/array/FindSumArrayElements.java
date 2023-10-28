package com.app.sam.array;

public class FindSumArrayElements {
    // write a function
    public static int sumArray(int[] array) {

        int sum =0;
        for (int i =0; i< array.length ; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Sum Elements " + sumArray(new int[]{1,2,3,4,5}));
    }
}
