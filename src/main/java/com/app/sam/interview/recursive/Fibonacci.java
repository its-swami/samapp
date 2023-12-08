package com.app.sam.interview.recursive;

import java.util.HashMap;

public class Fibonacci {

    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static int getNthFib(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n == 2) {
            cache.put(n, 1);
            return 1;
        } else if (n == 1) {
            cache.put(n, 0);
            return 0;
        } else {
            int result = getNthFib(n-1) + getNthFib(n-2);
            cache.put(n, result);
            return result;
        }
    }

    // Write Fibonacci using iterative approach
    public static int getNthFibIterative(int n) {
        int[] lastTwo = {0, 1};
        int counter = 3;
        while (counter <= n) {
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? lastTwo[1] : lastTwo[0];
    }

    public static void main(String args[]) {
        System.out.println(getNthFib(6));
    }
}
