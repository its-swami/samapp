package com.app.sam.str;

import java.util.ArrayList;
import java.util.List;

public class ReverseSentence {

    public static List<String> reverseSentence(String sentence) {


        int lastIndex = 0;
        List<String> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        char character = ' ';
        for (int i=0; i< sentence.length(); i++) {
            if(sentence.charAt(i) != ' ') {
                str.append(sentence.charAt(i));
            }

            if ((sentence.charAt(i) == ' ') || i == sentence.length() -1) {
                result.add(str.toString());
                str = new StringBuilder();
            }
        }
        return result;
    }

    public static void main(String args[]) {
        List<String> result = reverseSentence(" This is   Java ");
        System.out.println(result.size());
        for (int j = result.size()-1; j >= 0; j--) {
            System.out.print(result.get(j) + " ");
        }
    }
}
