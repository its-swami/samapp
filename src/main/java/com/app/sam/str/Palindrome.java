package com.app.sam.str;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    public static void main(String args[]) {
        System.out.println("Is Palindrome abaaaa -> " + Palindrome.isPalindrome(("aba")));
        String palindrome = "A man, a plan, a canal, Panama";
        String notPalindrome = "racecar!";

        System.out.println(isPalindrome(palindrome));  // Output: true
        System.out.println(isPalindrome(notPalindrome)); // Output: false
    }
}
