package com.app.sam.str;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    public static int nonRepeatingChar(String str) {
        Hashtable<Character, Integer> characterIntegerHashtable = new Hashtable<>();
        Set<Character> isCharSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!isCharSet.contains(str.charAt(i))) {
                isCharSet.add(str.charAt(i));
                characterIntegerHashtable.put(str.charAt(i), i);
            } else {
                characterIntegerHashtable.remove(str.charAt(i));
            }
        }
        if (characterIntegerHashtable.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (characterIntegerHashtable.get(str.charAt(i)) != null) {
                    return characterIntegerHashtable.get(str.charAt(i));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String name = "aabd";
        int i = nonRepeatingChar(name);
        System.out.println("Position:" + i);
    }
}