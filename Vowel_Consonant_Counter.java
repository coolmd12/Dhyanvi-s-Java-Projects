/*
Write a program to count the number of vowels and consonants in a string.
Example:
Input: "Java"
Output: Vowels: 2, Consonants: 2
*/

import java.util.Scanner;

public class Vowel_Consonant_Counter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = myScanner.nextLine().toLowerCase(); // converts to lower case

        int vowels = 0, consonants = 0; // declaring variables, initializing them to 0

        for (int i = 0; i < str.length(); i++) { // looping through each character
            char ch = str.charAt(i); // get character at position i

            if (ch >= 'a' && ch <= 'z') { // Only letters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // check if vowel
                    vowels++; // increase vowels
                } else {
                    consonants++; // increase consonants
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
    