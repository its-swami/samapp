package com.app.sam.interview.string;

import java.util.HashSet;

public class UniqueString {

    public boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                return false;
            }
            set.add(str.charAt(i));
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(new UniqueString().isUnique("abac"));
    }
}
