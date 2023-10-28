package com.app.sam.str;

public class ReverseSentenceShanmugam {

    private static String reverseSentence(String input) {
        // Input: "how  are you"
        char[] inputChars = input.toCharArray();

        // First reverse output: "uoy era  woh"
        reverseString(inputChars, 0, inputChars.length);
        System.out.println(input);

        int startIndex=0;
        boolean isPreviousCharSpace = false;
        for(int i=0; i<inputChars.length; i++){
            boolean isLastChar = i==inputChars.length-1;
            if(inputChars[i]==' ' || isLastChar){
                if(!isPreviousCharSpace) {
                    reverseString(inputChars, startIndex, i-1);
                    isPreviousCharSpace = true;
                }
                startIndex = i+1;
            }else {
                isPreviousCharSpace = false;
            }
        }

        return inputChars.toString();
    }


    private static void reverseString(char[] str, int startIndex, int endIndex) {
        int firstPointer = startIndex;
        int lastPointer = endIndex;
        int strLength = endIndex - startIndex;
        for(int i=0; i<strLength/2; i++) {
            char temp = str[lastPointer];
            str[lastPointer] = str[firstPointer];
            str[firstPointer] = temp;
        }
    }

    public static void main(String args[]) {
        System.out.println(reverseSentence("How are you"));
    }
}

