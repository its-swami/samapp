package com.app.sam.array;

public class FindLargestArray {

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        System.out.println(findLargest(new int[]{51, 1, 2, 3, 4, 5}));
    }
}
