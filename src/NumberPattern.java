import java.util.Scanner;

public class NumberPattern{
    public static void main(String[] args){
        Scanner myNumScanner = new Scanner(System.in);
        System.out.println("How many rows of numbers would you like to print? ");
        int rows = myNumScanner.nextInt();

        int num = 1; // starting number

        for (int i = 1; i <= rows; i++) { //Make the computer print a certain number of rows
            for (int j = 1; j <= i; j++) { //Helps us to print the numbers that will be present in the rows
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        myNumScanner.close();
    }
}