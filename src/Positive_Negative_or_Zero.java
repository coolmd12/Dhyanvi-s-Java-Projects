// Take a number as input and check whether 
// it is positive, negative, or zero using if-else.

import java.util.Scanner;
public class Positive_Negative_or_Zero{
    public static void main(String []args){
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Please enter a number: ");
        int myIntegerInput = myScanner.nextInt();
        
        if (myIntegerInput > 0){
            System.out.println("Your input's number is positive.");
        }

        else if (myIntegerInput ==- 0){
            System.out.println("Your input's number is zero.");
        }

        else{
            System.out.println("Your input's number is negative.");
        }

    }
}
