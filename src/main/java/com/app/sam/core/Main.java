package com.app.sam.core;

public class Main {

    public static void main(String[] args) {
        Looping.showString("SWAMINATHAN");
        Looping.showString2("SWAMINATHAN");
        Looping.reverse("SWAMINATHAN");
        System.out.println("\\n");
        System.out.println(Looping.matchString("SWAMI", "NATHAN"));
        System.out.println(Looping.matchString("SWAMI", "SWAMI"));

        // Anagram
        System.out.println("ABBA is PALINDROME -> " + Looping.isPalindrome("ABBA"));
        System.out.println("SWAMI is PALINDROME -> " + Looping.isPalindrome("SWAMI"));
    }
}
