package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _08_CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String day = scan.nextLine();

        // Print the price of the ticket based on the day
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            default:
                System.out.println(16);
                break;
        }
        
        scan.close();
    }
}
