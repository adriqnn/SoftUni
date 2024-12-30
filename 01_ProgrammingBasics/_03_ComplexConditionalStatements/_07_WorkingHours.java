package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _07_WorkingHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values for hours and day
        int hours = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        // Set a check for the working hours of the store
        boolean isOpen = (hours >= 10 && hours <= 18);

        // Determine if the store is open or closed and print the result
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (isOpen) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            default:
                System.out.println("closed");
                break;
        }

        scan.close();
    }
}
