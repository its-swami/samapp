package com.app.sam.str;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {
    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int startIndex = 0;
        int currentStart = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("c -> " + c);
            if (charIndexMap.containsKey(c)) {
                System.out.println("currentStart -> " + currentStart);
                currentStart = Math.max(currentStart, charIndexMap.get(c) + 1);
            }

            charIndexMap.put(c, i);
            System.out.println("charIndexMap -> " + charIndexMap);
            if (i - currentStart + 1 > maxLength) {
                maxLength = i - currentStart + 1;
                startIndex = currentStart;
            }
            System.out.println("maxLength -> " + maxLength);
            System.out.println("startIndex -> " + startIndex);
        }

        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcdabc ";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Input String: " + input);
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring);
    }
}