/*
Write a program to check if a given string is a palindrome.
Example:
Input: "madam"
Output: Palindrome
*/

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("A palindrome is a word that remains the same when reversed. Please enter a word to check if it is a palindrome: ");
        String myWord = myScanner.nextLine();

        String myReverseWord = new StringBuilder(myWord).reverse().toString(); // StringBuilder helps us to hold our word - it's like a folder for the value of our variable
        // .reverse() reverses the letters in the string; it only works in string & .toString() converts it from a mutable (changable) to an immutable (non-changable) string

        if (myWord.equals(myReverseWord)) {
            System.out.println("This word is a palindrome");
        }
        else {
            System.out.println("This word is not a palindrome");
        }
    }
}
