import java.util.Scanner; // import statement

public class TaskList { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initiate Scanner

        System.out.print("Enter number of tasks: "); // print statement
        int n = sc.nextInt(); 
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Task #" + i + ": ");
            String task = sc.nextLine();

            // DATE VALIDATION
            String taskDate;
            while (true) {
                System.out.print("Enter date (dd/MM/yyyy): ");
                taskDate = sc.nextLine();

                if (taskDate.matches("(0[1-9]|[12][0-9]|3[01])/"
                        + "(0[1-9]|1[0-2])/"
                        + "\\d{4}")) {
                    break;
                } else {
                    System.out.println("Invalid date format! Try again.");
                }
            }

            // TIME VALIDATION
            String taskTime;
            while (true) {
                System.out.print("Enter time (HH:mm): ");
                taskTime = sc.nextLine();

                if (taskTime.matches("([01][0-9]|2[0-3]):[0-5][0-9]")) {
                    break;
                } else {
                    System.out.println("Invalid time format! Try again.");
                }
            }

            System.out.println("Task Saved Successfully!\n");
        }

        sc.close();
    }
}
