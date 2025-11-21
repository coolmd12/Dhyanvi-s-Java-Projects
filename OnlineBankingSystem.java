/*
Simulates basic banking operations like creating accounts, depositing, withdrawing, and checking balances.
*/

//testing comment

import java.util.Scanner;

public class OnlineBankingSystem {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Ayan Sir and Dhyanvi's Bank! Please input your name for an account: "); //User's name
        String userName = myScanner.nextLine();

        System.out.println("Next step: enter your preferred communication method - email or phone number : "); //User's Contact Info
        String userCommunication = myScanner.nextLine();

        System.out.println("Would you like to start transactions? 'Yes' or 'No' ?");
        String userFirstQuestion = myScanner.nextLine().toLowerCase();

       //String userFirstQuestion
        String userBankChoice;
        double balance = 0;
        double userDepositAmount;
        double userWithdrawAmount;
        boolean exit;
        String userNextChoice;

        if (userFirstQuestion.equals("yes")){
            System.out.println("Type 'withdraw' to withdraw money, 'deposit' to deposit money, 'check balance' to check balance in account, or 'exit' to exit at any point of time. \n(All transactions will be in dollars)");
            userBankChoice = myScanner.nextLine().toLowerCase();

            //depositing money
            while (userBankChoice.equals("deposit")) {
                System.out.println("How much money would you like to deposit in your account, "+userName+"?");
                userDepositAmount = myScanner.nextDouble();
                balance = balance + userDepositAmount;
                System.out.println("You have successfully deposited $"+userDepositAmount+" in your account. Your total balance is now: $"+balance+".");
                String nextInput = myScanner.nextLine().toLowerCase();
            }

            //withdrawing money
            while(userBankChoice.equals("withdraw")) {
                System.out.println("How much money would you like to withdraw from your account, "+userName+"?");
                userWithdrawAmount = myScanner.nextDouble();
                    if (userWithdrawAmount <= balance) {
                        System.out.println("You have successfully withdrew $"+userWithdrawAmount+" out of your account. ");
                        balance = balance - userWithdrawAmount;
                    }

                    else {
                        System.out.println("Sorry, you don't have enough money to withdraw that amount. Your balance is: "+balance);
                        System.out.println("Would you like to do anything else? Remember, 'withdraw' = withdraw money, 'deposit' = deposit money, 'check balance'=check money balance, 'exit'=exit this ");
                        userNextChoice = myScanner.nextLine();
                    }
            }

            //checking money balance
            while (userBankChoice.equals("check balance")) {
                System.out.println("Your balance is: "+balance);
                System.out.println("Would you like to do anything else? Remember, 'withdraw' = withdraw money, 'deposit' = deposit money, 'check balance'=check money balance, 'exit'=exit this ");
                userNextChoice = myScanner.nextLine();
            }
            while (userBankChoice.equals("exit")) {
                System.out.println("Ok bye!");
                break;
            }
        }  
        
        else {
            System.out.println("Pleased to have you with us. Come again soon! Good bye!");
        }      
    }
}

/*
//depositing money
        while (userBankChoice.equals("deposit")) {
            System.out.println("How much money would you like to deposit in your account, "+userName+"?");
            userDepositAmount = myScanner.nextDouble();
            balance = balance + userDepositAmount;
            System.out.println("You have successfully deposited $"+userDepositAmount+" in your account. Your total balance is now: "+balance);
        }

//withdrawing money
        while(userBankChoice.equals("withdraw")) {
            System.out.println("How much money would you like to withdraw from your account, "+userName+"?");
            userWithdrawAmount = myScanner.nextDouble();
            if (userWithdrawAmount <= balance) {
                System.out.println("You have successfully withdrew $"+userWithdrawAmount+" out of your account. ");
                balance = balance - userWithdrawAmount;
                System.out.println("Would you like to do anything else? Remember, 'withdraw' = withdraw money, 'deposit' = deposit money, 'check balance'=check money balance, 'exit'=exit this ");
                userNextChoice = myScanner.nextLine();
            }
            else {
                System.out.println("Sorry, you don't have enough money to withdraw that amount. Your balance is: "+balance);
                System.out.println("Would you like to do anything else? Remember, 'withdraw' = withdraw money, 'deposit' = deposit money, 'check balance'=check money balance, 'exit'=exit this ");
                userNextChoice = myScanner.nextLine();
            }
        }

        //checking money balance
        while (userBankChoice.equals("check balance")) {
            System.out.println("Your balance is: "+balance);
            System.out.println("Would you like to do anything else? Remember, 'withdraw' = withdraw money, 'deposit' = deposit money, 'check balance'=check money balance, 'exit'=exit this ");
            userNextChoice = myScanner.nextLine();
        }

        //exiting applacation
        while (userBankChoice.equals("exit")) {
            System.out.println("Okay, bye!");
            myScanner.close();
        }
        /*
        while (userBankChoice != ("deposit"||"withdraw"||"check balance"||"exit")){
            System.out.println("Sorry, this option is not supported. ");
        }
*/