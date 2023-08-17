package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String type = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        double ticketPrice = 0.00;

        // Calculate the total earnings based on ticket type
        switch (type) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        // Calculate earnings
        double totalEarnings = ticketPrice * row * number;

        // Display the total earnings formatted with 2 decimal places
        System.out.printf("Total earnings: %.2f leva%n", totalEarnings);
        
        scan.close();
    }
}
