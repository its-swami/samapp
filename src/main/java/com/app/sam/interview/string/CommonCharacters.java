package com.app.sam.interview.string;

import java.util.HashMap;

public class CommonCharacters {

    public static void commonCharacters(String[] input) {
        HashMap<Character, Integer> map = new HashMap<>();
        String[] result = new String[26];

        if (input.length ==0) {
            System.out.println("Not found");
        }
        boolean flagFound = false;
        char charFound = ' ';
        for (int i =0; i< input.length; i++) {
            String str = input[i];

            for (int j=0; j< input.length; j++) {

                if ( i != j) {
                    String check = input[j];

                    for (int k=0; k < str.length(); k++) {
                        flagFound = false;
                        charFound = ' ';
                        for (int l =0; l< check.length(); l++) {
                            if (str.charAt(k) == check.charAt(l) && charFound != check.charAt(l)    && !flagFound) {
                                charFound = str.charAt(k);
                                map.put(charFound, map.get(charFound) != null ? map.get(charFound) + 1 : 1);
                                flagFound = true;
                            }
                        }
                    }
                    // System.out.println("String " + input[i] + "-" + input[j]);
                }
//
//                if (flagFound && charFound != ' ') {
//                    map.put(charFound, map.get(charFound) != null ? map.get(charFound) + 1 : 1);
//                }
               // System.out.println("String " + input[i] + "-" + input[j]);

            }

        }
        System.out.println(map);
    }

    public static void main(String args[]) {
        commonCharacters(new String[]{"bella","label","roller"});
    }
}
