package com.app.sam.interview.string;

public class RunLengthEncoding {

    /**
     *
     * @param str
     * @return
     */
    public static String runLengthEncoding(String str) {
        StringBuilder encodedStringCharacters = new StringBuilder();
        int currentRunLength = 1;
        char lastProcessed ;
        for (int i = 1; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            char previousCharacter = str.charAt(i - 1);
            if (currentCharacter != previousCharacter || currentRunLength == 9) {
                encodedStringCharacters.append(Integer.toString(currentRunLength));
                encodedStringCharacters.append(previousCharacter);
                currentRunLength = 0;
            }
            currentRunLength += 1;
        }
        encodedStringCharacters.append(Integer.toString(currentRunLength));
        encodedStringCharacters.append(str.charAt(str.length() - 1));
        return encodedStringCharacters.toString();
    }

    /**
     *
     * @param name
     * @return
     */
    public static String encoding(String name) {
        StringBuilder output = new StringBuilder();
        if ( name == null || name.isEmpty() ){
            return output.toString();
        }
        char lastProcessed = name.charAt(0);
        int charCount = 1;
        for (int i = 1; i < name.length(); i++) {
            if (lastProcessed == name.charAt(i) && charCount < 9) {
                charCount++;
            } else {
                output.append(charCount).append(lastProcessed);
                lastProcessed = name.charAt(i);
                charCount = 1;
            }
        }
        output.append(charCount).append(lastProcessed);
        return output.toString();
    }

    public static void main(String args[]) {
        System.out.println(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
        System.out.println(encoding("AAAAAAAAAAAAABBCCCCDD"));
    }
}
