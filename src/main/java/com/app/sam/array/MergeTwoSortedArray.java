package com.app.sam.array;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {


    static int[] merge(int[] arr1, int[] arr2)
    {

        int[] result = new int[arr1.length + arr2.length];

        int m = arr1.length;
        int n = arr2.length;

        // Iterate through all elements of ar2[] starting
        // from the last element
        for (int i = n - 1; i >= 0; i--) {
            /* Find the smallest element greater than
               ar2[i]. Move all elements one position ahead
               till the smallest greater element is not
               found */
            int j, last = arr1[m - 1]; // explain this line

            for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--)
                arr1[j + 1] = arr1[j];

            // If there was a greater element
            if (last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
        // add arr1 and arr2 to result
        System.arraycopy(arr1, 0, result, 0, m);
        System.arraycopy(arr2, 0, result, m, n);
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr1 = { 1, 5, 9, 10, 15, 20 };
        int[] arr2 = { 2, 3, 8, 13 };
        System.out.println("Before Merging");
        System.out.print("First Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array: ");
        System.out.println(Arrays.toString(arr2));
        int[] result = merge(arr1, arr2);




        System.out.print("After Merging : ");
        System.out.println(result[0] + " " + result[1] + " " + result[2] + " " +
                result[3] + " " + result[4] + " " + result[5] + " " +
                result[6] + " " + result[7] + " " + result[8] + " " +
                result[9] );

        // add more test case for merge

        int[] arr3 = { 1, 5, 10 };
        int[] arr4 = { 2, 3, 6, 7 };
        System.out.println("Before Merging");
        System.out.print("First Array: ");
        System.out.println(Arrays.toString(arr3));
        System.out.print("Second Array: ");
        System.out.println(Arrays.toString(arr4));
        int[] result1 = merge(arr3, arr4);




        System.out.print("After Merging : ");
        System.out.println(result[0] + " " + result[1] + " " + result[2] + " " +
                result[3] + " " + result[4] + " " + result[5] + " " +
                result[6] );
    }

}
