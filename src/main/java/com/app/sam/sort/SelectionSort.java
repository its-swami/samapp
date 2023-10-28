package com.app.sam.sort;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {
        int min_index = 0;
        int temp =0;
        for (int i=0; i< array.length; i++) {
            min_index = i;
            for (int j=i+1; j< array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }

            temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String args[]) {
        System.out.println("Sorted array of {3, 4, 3, 0, 5, 67} is " + java.util.Arrays.toString(selectionSort(new int[]{3, 4, 3, 0, 5, 67} )));
        System.out.println("Sorted array of {1, 2, 3, 4, 5} is " + java.util.Arrays.toString(selectionSort(new int[]{1, 2, 3, 4, 5} )));
        System.out.println("Sorted array of {5, 4, 3, 2, 1} is " + java.util.Arrays.toString(selectionSort(new int[]{5, 4, 3, 2, 1} )));
    }
}
