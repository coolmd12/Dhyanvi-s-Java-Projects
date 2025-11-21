//Write a Java program to store student names and their grades in a HashMap, then allow the user to enter a student’s name to display their grade.

import java.util.Scanner;
import java.util.LinkedHashMap;

public class StudentStorageSystem {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Create LinkedHashMap to store student name and grade
        LinkedHashMap<String, String> students = new LinkedHashMap<>();

        students.put("Suresh", "Overall Grade: 97%");
        students.put("Sally", "Overall Grade: 90%");
        students.put("Dhyanvi", "Overall Grade: 99.5%");
        
        // Display menu
        System.out.println("Welcome! This is the student record portal.");
        System.out.println("Select a student to view their record:");
        System.out.println("1. Suresh");
        System.out.println("2. Sally");
        System.out.println("3. Dhyanvi");
        System.out.print("Enter your choice (1-3): ");

        int userInput = myScanner.nextInt();

        // Use switch — only printing one case as requested
        switch (userInput) {
            case 1:
                System.out.println("Student: Suresh");
                System.out.println(students.get("Suresh"));
                break;
            case 2:
                System.out.println("Student: Sally");
                System.out.println(students.get("Sally"));
                break;
            case 3:
                System.out.println("Student: Dhyanvi");
                System.out.println(students.get("Dhyanvi"));
            default :
                System.out.println("Invalid choice or not implemented yet!");
                break;
        }

        myScanner.close();
    }
}