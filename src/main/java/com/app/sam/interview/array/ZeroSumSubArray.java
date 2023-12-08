package com.app.sam.interview.array;

public class ZeroSumSubArray {


    public static boolean zeroSumSubArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                sum = sum + array[j];
                if (sum == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] array = {1, 2, 3, 4, -9, 6, 7, 8, 9, 10};
        boolean zeroSumSubArray = zeroSumSubArray(array);
        System.out.println("Final:" + zeroSumSubArray);
    }
}
