// Ask the user for their age and check if they are eligible to vote (age ≥ 18).

import java.util.Scanner;

public class EligibilityToVote{
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Greetings! Please enter your age: ");
        int myAge = myScanner.nextInt();

        if (myAge >= 18){
            System.out.println("Congratulations! You are eligible to vote! ");
        }

        else{
            System.out.println("Unfortunately, you cannot vote. ");
        }

    }
}