package com.app.sam.interview.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSumArrayTarget {
    public static void main(String[] args) {
        int[] arr = {12,3,1,2,-6,5,-8,6};

        List<Integer[]> result = findSum1(arr, 0);
        // sort and print result




        //System.out.println("Result 1: " + result);

//        result = findSum2(arr, 9);
//        System.out.println("Result 2: " + result[0] + " " + result[1]);
//
//        result = findSum3(arr, 9);
//        System.out.println("Result 3: " + result[0] + " " + result[1]);
    }

    public static List<Integer[]> findSum1(int[] arr, int target) {
        List<Integer[]> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< arr.length; i++) {
            for (int j =i + 1; j < arr.length; j++) {
                for (int k= j+ 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        result.add(new Integer[]{arr[i], arr[j], arr[k]});
                    }
                }
            }
        }
        return result;
    }
}
