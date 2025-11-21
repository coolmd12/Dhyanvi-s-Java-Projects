//Healthcare management system

 import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class HealthcareManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        Random random = new Random();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Sign Up");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Sign Up
                    System.out.print("Enter new User ID: ");
                    String newUser = sc.nextLine();

                    if (users.containsKey(newUser)) {
                        System.out.println("User ID already exists. Try logging in!");
                    } else {
                        System.out.print("Enter Password: ");
                        String newPass = sc.nextLine();
                        users.put(newUser, newPass);
                        System.out.println("User registered successfully!");
                        userPortal(sc, random); // go to portal
                    }
                    break;

                case 2: // Login
                    System.out.print("Enter User ID: ");
                    String userId = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    if (users.containsKey(userId) && users.get(userId).equals(password)) {
                        System.out.println("Login successful! Welcome, " + userId);
                        userPortal(sc, random);
                    } else {
                        System.out.println("Invalid ID or Password!");
                    }
                    break;

                case 3: // Exit
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // User Portal logic
    private static void userPortal(Scanner sc, Random random) {
        while (true) {
            System.out.println("\n--- Health Portal ---");
            System.out.println("1. Consult a Doctor");
            System.out.println("2. Get a Medicine");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");

            int portalChoice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (portalChoice == 1) {
                System.out.println("What doctor do you need?");
                System.out.println("1. Pediatrician (kids)");
                System.out.println("2. Dermatologist (skin, hair, nails)");
                System.out.println("3. Adult Doctor");
                int docChoice = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter preferred month: ");
                String month = sc.nextLine().toLowerCase();

                int daysInMonth = 30;
                if (month.equals("january") || month.equals("march") || month.equals("may") ||
                    month.equals("july") || month.equals("august") || month.equals("october") ||
                    month.equals("december")) {
                    daysInMonth = 31;
                } else if (month.equals("february")) {
                    daysInMonth = 28;
                }

                int day = random.nextInt(daysInMonth) + 1;
                System.out.println("Your appointment is on " + capitalize(month) + " " + day + ".");

                while (true) {
                    System.out.print("Type 'reschedule' or 'exit': ");
                    String userSchedule = sc.nextLine().toLowerCase();
                    if (userSchedule.equals("reschedule")) {
                        int newDay = random.nextInt(daysInMonth) + 1;
                        System.out.println("New schedule: " + capitalize(month) + " " + newDay + ".");
                    } else {
                        break;
                    }
                }

            } else if (portalChoice == 2) {
                System.out.print("Enter medicine name: ");
                String medicine = sc.nextLine();
                System.out.print("Enter number of doses: ");
                int medNum = sc.nextInt();
                sc.nextLine();
                System.out.println("Sending " + medNum + " dose(s) of " + medicine + ". (Use at your own risk!)");

            } else if (portalChoice == 3) {
                break; // back to main menu
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}