package com.company;

public class WordPlay {

    // Returns true if the char is a vowel
    public boolean isVowel(char ch){
        String vowels = "aeiou";
        if(vowels.indexOf(ch) != -1){
            return true;
        } else {
            return false;
        }
    }

    // Function to replace vowels in a string with a defined character
    public String replaceVowels(String phrase, char ch){
        StringBuilder newString = new StringBuilder(phrase);

        for(int i = 0; i < phrase.length(); i++){
            char currentChar = phrase.toLowerCase().charAt(i);

            if(isVowel(currentChar)){
                newString.setCharAt(i, ch);
            }
        }
        return newString.toString();
    }

    // Function to replace a defined character in a string with either * og +
    public String emphasize(String phrase, char ch){
        StringBuilder newString = new StringBuilder(phrase);

        for(int i = 0; i < phrase.length(); i++){
            char currentChar = phrase.toLowerCase().charAt(i);

            if(isVowel(currentChar) && currentChar == ch){
                if(i %2 == 0) {
                    newString.setCharAt(i, '*');
                } else {
                    newString.setCharAt(i, '+');
                }
            }
        }
        return newString.toString();
    }
}
