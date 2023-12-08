package com.app.sam.interview.array;

public class FirstDuplicateValueArray {

    public static int firstDuplicateValueArray(int[] array) {
        int firstDuplicate = -1;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (newArray[array[i] - 1] == 0) {
                newArray[array[i] - 1] = array[i];
            } else {
                firstDuplicate = array[i];
                break;
            }
        }
        return firstDuplicate;
    }

    public static int firstDuplicateValueArray2(int[] array) {
        int firstDuplicate = -1;
        for (int i = 0; i < array.length; i++) {
            int absValue = Math.abs(array[i]);
            if (array[absValue - 1] < 0) {
                firstDuplicate = absValue;
                break;
            } else {
                array[absValue - 1] = -array[absValue - 1];
            }
        }
        return firstDuplicate;
    }


    public static void main(String args[]) {
        int[] array = {2, 1, 5, 2, 3, 3, 4};
        int firstDuplicateValueArray = firstDuplicateValueArray(array);
        System.out.println("Final:" + firstDuplicateValueArray);
    }
}
