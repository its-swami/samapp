package com.app.sam.interview.string;

/**
 * Level: Easy
 * Problem: https://leetcode.com/problems/count-and-say/
 *
 * @author rampatra
 * @since 2019-04-20
 */
public class Recursive {

    public static void printStringRecursively(String input) {

        if (input.length() == 0) {
            // Base case: If the input string is empty, stop recursion
            return;
        } else {
            // Print the first character of the string
            System.out.println(input.charAt(0));

            // Recursively call the function with the remaining substring
            printStringRecursively(input.substring(1));
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        int startIndex = 0;

        // Call the recursive function to print the string.
        printStringRecursively(input);
        System.out.println("First character of the string is: " + input.charAt(startIndex));
    }
}
