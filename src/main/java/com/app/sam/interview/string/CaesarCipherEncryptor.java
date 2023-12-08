package com.app.sam.interview.string;

public class CaesarCipherEncryptor {
    public static String caesarCipherEncryptor(String str, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char encryptedChar = getEncryptedChar(str.charAt(i), key);
            stringBuilder.append(encryptedChar);
        }
        return stringBuilder.toString();
    }

    public static char getEncryptedChar(char c, int key) {
        int startRange = 97;
        int endRange = 122;
        int charValue = c;
        int addedValue = charValue + key;
        if (addedValue > endRange) {
            int i = startRange + ((addedValue - endRange) % 26);
            c = i == startRange ? (char) endRange : (char) i;
        } else {
            c = (char) addedValue;
        }
        return c;
    }

    public static void main(String[] args) {
        String name = "z";
        int key = 2;
        String s = caesarCipherEncryptor(name, key);
        System.out.println("Encrypted Char:" + s);

    }
}