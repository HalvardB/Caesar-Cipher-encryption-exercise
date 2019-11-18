package com.company;

public class Main {

    public static void main(String[] args) {

        // Initialize the classes
        CaesarCipher caesarCipher = new CaesarCipher();
        WordPlay wordPlay = new WordPlay();

        // WordPlay tests
        System.out.println("WordPlay tests:");
        System.out.println(" - A is a vowel: " + wordPlay.isVowel('a'));
        System.out.println(" - B is a vowel: " + wordPlay.isVowel('b'));
        System.out.println(" - 'Hello World' without vowels: " + wordPlay.replaceVowels("Hello World", '*'));
        System.out.println(" - 'Mary Bella Abracadabra' without A's is: " + wordPlay.emphasize("Mary Bella Abracadabra", 'a'));

        // Caesar Cipher
        System.out.println("\n" + "Caesar Cipher tests:");
        String message = "'Free cake in the lunch room. RUN!'";

        System.out.println("The string to be encrypted is: " + message);
        String encrypt1 = caesarCipher.encryptString(message, 15);
        System.out.println(" - Encrypted string with 1 key is: " + encrypt1);

        String encrypt2 = caesarCipher.encryptTwoKeys(message, 15, 21);
        System.out.println(" - Encrypted string with 2 keys is: " + encrypt2);
    }
}
