import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter any amount of money (in dollars): ");
        double amount = myScanner.nextDouble(); 
        myScanner.nextLine(); 

        System.out.println("Now please enter the type of currency you want to convert it to: ");
        String currency = myScanner.nextLine().toLowerCase(); // convert input to lowercase

        if (currency.equals("euros")) {
            double convertedAmount = amount * 0.86;
            System.out.println("You have " + convertedAmount + " euros");
        } 
        if (currency.equals("rupees")) {
            double convertedAmount = amount * 87.59;
            System.out.println("You have "+convertedAmount+" rupees");
        }
        if (currency.equals("pesos")) {
            double convertedAmount = amount * 18.65;
            System.out.println("You have "+convertedAmount+" Mexican Pesos");
        }
        if (currency.equals("pounds")) {
            double convertedAmount = amount * 0.74;
            System.out.println("You have "+convertedAmount+" pounds");
        }
        else {
            System.out.println("Currency not supported.");
        }

        myScanner.close();
    }
}
