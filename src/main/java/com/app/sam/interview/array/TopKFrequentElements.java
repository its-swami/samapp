package com.app.sam.interview.array;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k =2;
        int[] result = topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        int[] count = new int[nums.length];
        int[] unique = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < index; j++) {
                if (nums[i] == unique[j]) {
                    isUnique = false;
                    count[j]++;
                }
            }
            if (isUnique) {
                unique[index] = nums[i];
                count[index] = 1;
                index++;
            }
        }

        System.out.println("K "+ k);
        System.out.println("Index "+ index);

        for (int i = 0; i < k; i++) {
            int max = 0;
            int maxIndex = 0;
            for (int j = 0; j < index; j++) {
                if (count[j] > max) {
                    max = count[j];
                    maxIndex = j;
                }
            }
            result[i] = unique[maxIndex];
            count[maxIndex] = 0;
        }
        return result;
    }
}
