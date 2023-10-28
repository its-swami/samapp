package com.app.sam.array;

import java.util.Arrays;

public class ReverseArray {

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];

        for (int i= 0; i< array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }

    public static void main(String args[]) {
        System.out.println("Reversed array of {1, 2, 3, 4, 5} is " + Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5} )));
    }
}
