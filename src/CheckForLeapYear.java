//Enter a year and check whether it is a leap year or not using if-else.

import java.util.Scanner;

public class CheckForLeapYear{
    public static void main(String []args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello! Please enter any year: ");
        int myYear = myScanner.nextInt();

        if (myYear % 4 == 0 && myYear % 100 !=0 || myYear % 4 == 0 && myYear % 100 == 0 && myYear % 400 == 0){
            System.out.println("This year is a leap year! ");
        }

        else{
            System.out.println("This is not a leap year. ");
        }
    }
}
