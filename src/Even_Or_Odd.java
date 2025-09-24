// Check whether a given number is even or odd using if-else.

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String []args){
        Scanner my_Scanner = new Scanner(System.in); 
        System.out.println("Hello! Please enter any positive number! ");
        int myIntInput = my_Scanner.nextInt();

        if (myIntInput !> 0){
            System.out.println("This is not a positive number. Please try again! ");
            int myIntInput = my_Scanner.nextInt();
        }
        
        else if (myIntInput % 2 == 0){
            System.out.println("Your number is an even number. ");
        }
        
        else{
            System.out.println("Your number is an odd number. ");
        }

    }
}