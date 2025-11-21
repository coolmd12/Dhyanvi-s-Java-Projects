import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome User! This is the Ultimate Rock Paper Scissors Terminal! Are you ready, to go against our bot? Enter 'yes' or 'no' : ");
        String userChoice = myScanner.nextLine().toLowerCase();

        if (userChoice.equals("yes")) {
            System.out.println("To win against our bot, you must beat them in at least 2 out of the three total rounds.");
            System.out.println("Preparing bot...");

            String a = "rock";
            String b = "scissors";
            String c = "paper";

            String[] randomRochambo = {a, b, c};
            Random rand = new Random();

            int userScore = 0;
            int botScore = 0;

            //  LOOP UNTIL SOMEONE GETS 2 POINTS
            while (userScore < 2 && botScore < 2) {

                System.out.println("\nOkay! Here we begin! Enter rock, paper, or scissors into the portal: ");
                String userEnter = myScanner.nextLine().toLowerCase();

                int randomIndex = rand.nextInt(randomRochambo.length);
                String randomOutput = randomRochambo[randomIndex];

                System.out.println("Bot chose: " + randomOutput);

                if (userEnter.equals(randomOutput)) {
                    System.out.println("Ooh...Tie");
                }
                else if ((userEnter.equals("rock") && randomOutput.equals("scissors")) ||
                         (userEnter.equals("paper") && randomOutput.equals("rock")) ||
                         (userEnter.equals("scissors") && randomOutput.equals("paper"))) {

                    System.out.println("Nice one! That's a point for you!");
                    userScore += 1;
                }
                else {
                    System.out.println("Yess! That's a point for me!");
                    botScore += 1;
                }

                System.out.println("Score -> You: " + userScore + " | Bot: " + botScore);
            }

            // WINNER MESSAGE
            if (userScore == 2) {
                System.out.println("\nWOW! CONGRATULATIONS! YOU WON! :)");
            } else {
                System.out.println("\nHA HA! LETS GO! I WON! Bye! :D");
            }
        }

        else {
            System.out.println("Okay! Hope you join us again soon!");
        }
    }
}