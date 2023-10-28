package com.app.sam.array;

import java.util.Arrays;

public class MaxElementArray {
    public static int maxElementArray(int[] array) {

        int max = 0;
        for (int i=0; i< array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static int maxElementArray1(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static void main(String args[]) {
        System.out.println("Max Element " + maxElementArray(new int[]{3, 4, 3, 0, 5, 67}));
        System.out.println("Max Element " + maxElementArray1(new int[]{3, 4, 3, 0, 5, 67}));
    }
}
