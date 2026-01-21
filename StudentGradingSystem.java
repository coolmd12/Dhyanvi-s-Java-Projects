/* Student Grading System Project: 
Build an application to manage student records and calculate grades. Users can input student 
names, subjects, and scores, and the system can calculate average grades, identify top 
performers, and generate reports.
*/

import java.util.*;

class Student {
    String name;
    Map<String, List<Double>> subjects = new HashMap<>();

    public Student(String name) {
        this.name = name;
    }

    public void addGrade(String subject, double grade) {
        subjects.putIfAbsent(subject, new ArrayList<>());
        subjects.get(subject).add(grade);
    }

    public void generateReport() {
        System.out.println("===== Report for " + name + " =====");
        for (Map.Entry<String, List<Double>> entry : subjects.entrySet()) {
            String subject = entry.getKey();
            List<Double> grades = entry.getValue();
            System.out.println("Subject: " + subject + " -> " + grades);
        }
        System.out.println("============================\n");
    }

    // NEW: Calculate and print averages
    public void printAverage() {
        System.out.println("===== Average Report for " + name + " =====");
        double totalAllGrades = 0;
        int totalGradeCount = 0;

        for (Map.Entry<String, List<Double>> entry : subjects.entrySet()) {
            String subject = entry.getKey();
            List<Double> grades = entry.getValue();

            double sum = 0;
            for (double g : grades) {
                sum += g;
            }

            double avg = grades.size() > 0 ? sum / grades.size() : 0;
            System.out.println("Subject: " + subject + " -> Average: " + avg);

            totalAllGrades += sum;
            totalGradeCount += grades.size();
        }

        double overallAverage = totalGradeCount > 0 ? totalAllGrades / totalGradeCount : 0;
        System.out.println("Overall Average: " + overallAverage);
        System.out.println("============================\n");
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter how many people you would like to input in the Student Grading System Portal: ");
        int userPeopleNumber = myScanner.nextInt();
        myScanner.nextLine(); // consume leftover newline

        List<Student> allStudents = new ArrayList<>();

        // Loop for each person
        for (int a = 0; a < userPeopleNumber; a++) {
            System.out.println("Hello! Enter name: ");
            String firstUserName = myScanner.nextLine();
            Student student = new Student(firstUserName);
            allStudents.add(student);

            boolean keepRunning = true;
            while (keepRunning) {
                System.out.println("Hello, " + firstUserName +
                        ". What would you like to do today? \n" +
                        "Type 'generate report' to generate a grade report, 'average' to see your average grade, or 'exit' to exit: ");
                String firstUserChoice = myScanner.nextLine().toLowerCase();

                if (firstUserChoice.equals("generate report")) {
                    System.out.println("How many subjects would you like to enter? ");
                    int subjectNum = myScanner.nextInt();
                    myScanner.nextLine(); // consume newline
                    for (int b = 0; b < subjectNum; b++) {
                        System.out.println("Enter a subject (name): ");
                        String subjectName = myScanner.nextLine();
                        System.out.println("Okay, subject " + (b + 1) + " is: " + subjectName +
                                ". Now, how many grades do you want to enter for " + subjectName + "? ");
                        int gradeAmount = myScanner.nextInt();
                        myScanner.nextLine(); // consume newline
                        for (int c = 0; c < gradeAmount; c++) {
                            System.out.println("Enter grade #" + (c + 1) + ": ");
                            double grade = myScanner.nextDouble();
                            myScanner.nextLine(); // consume newline
                            student.addGrade(subjectName, grade);
                        }
                    }
                    student.generateReport(); // show the report after entering
                } 
                
                else if (firstUserChoice.equals("average")) {
                    student.printAverage(); // NEW: print averages
                } 
                
                else if (firstUserChoice.equals("exit")) {
                    System.out.println("Exiting for " + firstUserName + "...");
                    keepRunning = false;
                } 
                
                else {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        myScanner.close();
        System.out.println("All students processed. Program ended.");
    }

}



/*
1️⃣ Student Grade Management System
Concepts used:

Variables, if-else

Loops

Features:

Input student name and marks

Calculate total & percentage

Assign grade (A/B/C/Fail)

👉 Extension: Handle multiple students using arrays
*/

import java.util.Scanner;
import java.util.LinkedHashMap;

public class StudentGradingSystem {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello, student. Please enter your name: ");
        String studentName = myScanner.nextLine();

        System.out.println("Welcome to the Student Grading System Portal, " + studentName);

        System.out.println("Please enter 1 subject which you would like to calculate information about: ");
        String subject = myScanner.nextLine();

        System.out.println("For " + subject + ", please enter how many test scores you want to enter: ");
        int testNum = myScanner.nextInt();

        LinkedHashMap<String, Double> testScores = new LinkedHashMap<>();
        double sumForAverage = 0.0;

        for (int x = 1; x <= testNum; x++) {
            System.out.println("Enter score for Test " + x + ": ");
            double score = myScanner.nextDouble();

            testScores.put("Test " + x, score);   // Store in HashMap
            sumForAverage += score;
        }

        double average = sumForAverage / testNum;

        System.out.println("\n----- Score Details -----");
        for (String key : testScores.keySet()) {
            System.out.println(key + " : " + testScores.get(key));
        }

        System.out.println("\nYour average grade (percentage) for " + subject + " is " + average);
        System.out.println("Thank you! Enjoy your day!");

        myScanner.close();
    }
}
*/
