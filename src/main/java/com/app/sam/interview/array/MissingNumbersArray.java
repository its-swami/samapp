package com.app.sam.interview.array;

import java.util.Arrays;

public class MissingNumbersArray {

    public static int missingNumber(int[] array) {
        int missingNumber = -1;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array.length) {
                newArray[array[i] - 1] = array[i];
            }
        }

        System.out.println("New Array:" + Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }
        return missingNumber;
    }

    public static void main(String args[]) {
        int[] array = {1, 4 ,3 };
        int missingNumber = missingNumber(array);
        System.out.println("Final:" + missingNumber);
    }
}
