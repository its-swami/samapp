package com.app.sam.array;


class AverageSubArraySlidingWindow {
    public static double[] findAverages(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        int windowStart =0;
        double windowSum =0;
        for(int windowEnd =0; windowEnd < arr.length; windowEnd ++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= K - 1) {
                result[windowStart] = windowSum / K;
                windowSum -= arr[windowStart];
                windowStart ++;
            }
        }

        return result;
    }

    public static int findMaxSubArray(int k, int[] arr) {
        int result = 0;
        int start = 0;
        int sum =0;
        for (int end =0; end < arr.length; end ++) {
            sum += arr[end];

            if (end >= k - 1) {
                if (sum > result) {
                    result = sum;
                }
                sum -= arr[start];
                start++;
            }
        }
        return result;
     }

    public static void main(String[] args) {
        // double[] result = AverageSubArraySlidingWindow.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });


        int result = AverageSubArraySlidingWindow.findMaxSubArray(1, new int[] { 2, 1, 5, 1, 3, 2});
        System.out.println("Averages of subarrays of size K: " + result);
    }


}