package com.app.sam.interview.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        boolean isPresent = false;
        int y = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (y < sequence.size() && sequence.size() <= array.size()) {
                if (array.get(i).equals(sequence.get(y))) {
                    y = y + 1;
                    integerList.add(array.get(i));
                }
                isPresent = integerList.equals(sequence);
            }
        }
        return isPresent;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 1, 6, 1};
        Integer[] sequence = {1, 1, 1, 6};
        boolean validSubsequence = isValidSubsequence(new ArrayList<Integer>(Arrays.asList(array)), new ArrayList<Integer>(Arrays.asList(sequence)));
        System.out.println("Final:" + validSubsequence);
    }
}
