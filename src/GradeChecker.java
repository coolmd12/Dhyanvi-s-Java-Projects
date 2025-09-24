/*

Ask the user to enter their marks and print:

A if marks ≥ 90

B if marks ≥ 75

C if marks ≥ 60

D if marks ≥ 40

F otherwise

*/

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter your test score from 0 to 100: ");
        int myScore = myScanner.nextInt();

        // Validation loop
        while (myScore < 0 || myScore > 100) {
            System.out.println("Error! You must enter a value from 0 to 100!");
            myScore = myScanner.nextInt();
        }

        // Grade check
        if (myScore >= 90) {
            System.out.println("You have received an A");
        } 
        else if (myScore >= 75) {
            System.out.println("You have received a B");
        }
        else if (myScore >= 60) {
            System.out.println("You have received a C");
        }
        else if (myScore >= 40) {
            System.out.println("You have received a D");
        }
        else {
            System.out.println("You have unfortunately received an F");
        }
    }
}
