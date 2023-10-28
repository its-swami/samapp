package com.app.sam.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> tempArray = new ArrayList<>();
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                for (int k = j + 1; k < array.length; ++k) {
                    if (array[i] + array[j] + array[k] == targetSum) {
                        tempArray.add(new Integer[]{array[i], array[j], array[k]});
                    }
                }
            }
        }
        return tempArray;
    }
}