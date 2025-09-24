/*
This number guessing game is an easy project built on Java
where the player has to guess a number given in between a range. If 
the guessed number is right, the player wins else, loses. It also has the
concept of limited attempts where the player has to guess the number within the limited attempts given.
*/

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome Player! You have 3 tries to guess the number (1-10).");

        int numberToGuess = rand.nextInt(10) + 1; // random number between 1 and 10
        int attempts = 0;
        boolean guessed = false;

        while (attempts < 3) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = myScanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number!");
                guessed = true;
                break;
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        if (!guessed) {
            System.out.println("Sorry! You've used all attempts. The correct number was: " + numberToGuess);
        }

        myScanner.close();
    }
}


/*
The approach for a Number Guessing Game in Java is to first generate a random number within a specified range 
(e.g., 1–100) using Random, then use a loop to allow the user to guess the number by taking input through Scanner. 
For each guess, compare it with the generated number: if it matches, display a success message and end the game;
if the guess is higher, show “Too High”, and if lower, show “Too Low”. Keep track of attempts and, if using a limit, 
end the game after the maximum attempts with a message revealing the correct number. Optionally, add features like 
replay, scoring, or validating user input.
*/