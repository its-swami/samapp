package com.app.sam.core;

public class Looping {

    public static void showString(String str) {
        for (int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }

    public static void showString2(String str) {
        for (char c: str.toCharArray()) {
            System.out.print(c);
        }
    }

    public static void reverse(String str) {
        for (int i=str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String args[]) {
        showString("SWAMINATHAN");
        showString2("SWAMINATHAN");
        reverse("SWAMINATHAN");
        System.out.println("\\n");
        System.out.println(matchString("SWAMI", "NATHAN"));
        System.out.println(matchString("SWAMI", "SWAMI"));

        // Anagram
        System.out.println("ABBA is PALINDROME -> " + isPalindrome("ABBA"));
        System.out.println("SWAMI is PALINDROME -> " + isPalindrome("SWAMI"));
    }

    /**
     *
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str) {
        int start =0;
        int end = str.length() -1;

        while ( start < end ) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start ++;
            end --;
        }
        return true;
    }

    /**
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean matchString(String str1, String str2) {
        for (int i =0; i< str1.length() -1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
