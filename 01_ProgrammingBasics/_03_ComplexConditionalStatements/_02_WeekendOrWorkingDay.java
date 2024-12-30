package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _02_WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value day from the console
        String day = scan.nextLine();

        // Print whether the day if valid is working day or weekend day
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }

        scan.close();
    }
}
