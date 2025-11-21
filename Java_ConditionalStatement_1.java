// Write a Java program that requires the user to enter a single character 
// from the alphabet. Print Vowel or Consonant, depending on user input. 
// If the user input is not a letter (between a and z or A and Z), or is a 
// string of length > 1, print an error message.

import java.util.Scanner;

public class Java_ConditionalStatement_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String myInput;

        while (true) {
            System.out.println("Please enter any single letter: ");
            myInput = myScanner.nextLine().toLowerCase();
            
            // Check if input is exactly one character and is a letter
            if (myInput.length() == 1 && Character.isLetter(myInput.charAt(0))) {
                // Success message if input is valid
                char ch = myInput.charAt(0);
                System.out.println("You entered the letter correctly: '" + ch + "'");
                System.out.println(" This is your letter.");

                // Vowel or consonant check
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("The letter '" + ch + "' is a vowel.");
                } else {
                    System.out.println("The letter '" + ch + "' is a consonant.");
                }
                break; // Exit the loop after correct input
            } else {
                // Invalid input
                System.out.println("Invalid input. You must enter a single alphabet letter only. Please try again.");
            }
        }

        myScanner.close();
    }
}
