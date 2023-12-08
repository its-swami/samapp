package com.app.sam.interview.string;

public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        String longestPalindromicSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            String oddLengthPalindrome = getLongestPalindrome(str, i, i);
            String evenLengthPalindrome = getLongestPalindrome(str, i, i + 1);
            String currentLongestPalindrome = oddLengthPalindrome.length() > evenLengthPalindrome.length() ? oddLengthPalindrome : evenLengthPalindrome;
            longestPalindromicSubstring = longestPalindromicSubstring.length() > currentLongestPalindrome.length() ? longestPalindromicSubstring : currentLongestPalindrome;
        }
        return longestPalindromicSubstring;
    }

    public static String getLongestPalindrome(String str, int leftIndex, int rightIndex) {
        while (leftIndex >= 0 && rightIndex < str.length()) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                break;
            }
            leftIndex--;
            rightIndex++;
        }
        return str.substring(leftIndex + 1, rightIndex);
    }

    public static String isPolyndromeStr(String str) {
        String longestPalindromicSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            String oddLengthPalindrome = getLongestPalindrome(str, i, i);
            String evenLengthPalindrome = getLongestPalindrome(str, i, i + 1);
            String currentLongestPalindrome = oddLengthPalindrome.length() > evenLengthPalindrome.length() ? oddLengthPalindrome : evenLengthPalindrome;
            longestPalindromicSubstring = longestPalindromicSubstring.length() > currentLongestPalindrome.length() ? longestPalindromicSubstring : currentLongestPalindrome;
        }
        return longestPalindromicSubstring;
    }
    public static boolean isPolindrome(String name){
        System.out.println("Substring:"+name);
        boolean isPresent = false;
        String str = "";
        for (int i=name.length()-1;i >= 0;i--){
            char c = name.charAt(i);
            str = str + Character.toString(c);
        }
        if (str.equals(name)){
            isPresent = true;
        }
        return isPresent;
    }

    public static void main(String args[]) {
        String str = "abaxyzzyxf";
        String longestPalindromicSubstring = longestPalindromicSubstring(str);
        System.out.println("Final:" + longestPalindromicSubstring);

        String name = "abaxyzzyxf";
        System.out.println("isPolyndromeStr :"+ isPolyndromeStr(name));
    }


}
