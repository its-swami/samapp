package com.app.sam.interview.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSumArrayTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] result = findSum1(arr, 9);
        System.out.println("Result 1: " + result[0] + " " + result[1]);

        result = findSum2(arr, 9);
        System.out.println("Result 2: " + result[0] + " " + result[1]);

        result = findSum3(arr, 9);
        System.out.println("Result 3: " + result[0] + " " + result[1]);

        result = findSum3(arr, 9);
        System.out.println("Result 4: " + result[0] + " " + result[1]);
    }

    public static int[] findSum1(int[] arr, int target) {
        int[] result = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++) {
            map.put(arr[i], 1);
        }

        for (int j =0; j < arr.length; j++) {
            int diff = target - arr[j];
            if (map.containsKey(diff) && diff != arr[j]) {
               result[0] = arr[j];
               result[1] = diff;
            }
        }

        return result;
    }

    public static int[] findSum2(int[] arr, int target) {
        int[] result = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++) {
            map.put(arr[i], 1);
        }
        System.out.println(map);
        for (int j =0; j < arr.length; j++) {
            int diff = target - arr[j];
            if (map.containsKey(diff) && diff != arr[j]) {
                result[0] = arr[j];
                result[1] = diff;
            }
            map.put(arr[j], 1);
        }

        return result;
    }
    public static int[] findSum3(int[] arr, int target) {
        int[] result = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }



        return result;
    }

    public static void findSum4(int[] arr, int sumVal)
    {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++)
        {
            int complement = sumVal-arr[i];
            if (set.contains(complement))
            {
                System.out.println("Result is "+complement+","+arr[i]);
            }
            set.add(arr[i]);
        }
    }

}
