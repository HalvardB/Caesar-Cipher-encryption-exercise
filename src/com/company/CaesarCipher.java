package com.company;

public class CaesarCipher {

    // Find the shifted alphabet based on a key value.
    // If the key is 3, the new alphabet starts at X
    private String getCryptoAlphabet(int key, String string){
        return string.substring(key) + string.substring(0,key);
    }

    // Encrypt a string based on a key value
    public String encryptString(String cryptedString, int key){
        StringBuilder newString = new StringBuilder(cryptedString);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cryptoAlphabet = getCryptoAlphabet(key, alphabet);

        for(int i = 0; i < cryptedString.length(); i++){
            char currentChar = cryptedString.toLowerCase().charAt(i);
            int currentIndex = alphabet.toLowerCase().indexOf(currentChar);

            if(currentChar != ' ' && currentIndex != -1) {

                if(Character.isUpperCase(cryptedString.charAt(i))){
                    newString.setCharAt(i, cryptoAlphabet.charAt(currentIndex));
                } else {
                    newString.setCharAt(i, Character.toLowerCase(cryptoAlphabet.charAt(currentIndex)));
                }

            }
        }
        return newString.toString();
    }

    // Encrypt a string using two keys.
    public String encryptTwoKeys(String cryptedString, int key1, int key2){

        StringBuilder newString = new StringBuilder(cryptedString);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key1Alphabet = getCryptoAlphabet(key1, alphabet);
        String key2Alphabet = getCryptoAlphabet(key2, alphabet);

        for(int i = 0; i < cryptedString.length(); i++){
            String cryptoAlphabet;

            // Even numbers use key1 and odd numbers use key2
            if(i%2 == 0){
                cryptoAlphabet = key1Alphabet;
            } else {
                cryptoAlphabet = key2Alphabet;
            }

            char currentChar = cryptedString.toLowerCase().charAt(i);
            int currentIndex = alphabet.toLowerCase().indexOf(currentChar);

            // Filter out empty spaces and special characters
            if(currentChar != ' ' && currentIndex != -1) {

                // Make sure to set character to upper og lower case vales based on the crypted string
                if(Character.isUpperCase(cryptedString.charAt(i))){
                    newString.setCharAt(i, cryptoAlphabet.charAt(currentIndex));
                } else {
                    newString.setCharAt(i, Character.toLowerCase(cryptoAlphabet.charAt(currentIndex)));
                }

            }
        }
        return newString.toString();
    }
}
