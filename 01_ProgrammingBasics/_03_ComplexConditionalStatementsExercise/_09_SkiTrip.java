package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _09_SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int days = Integer.parseInt(scan.nextLine());
        String roomType = scan.nextLine();
        String rating = scan.nextLine();

        double totalPrice = 0;

        // Calculate total price based on room type and number of days
        if (roomType.equals("room for one person")) {
            totalPrice = (days - 1) * 18.00;
        } else if (roomType.equals("apartment")) {
            if (days > 15) {
                totalPrice = ((days - 1) * 25.00) * 0.5;
            } else if (days >= 10) {
                totalPrice = ((days - 1) * 25.00) * 0.65;
            } else if (days >= 0) {
                totalPrice = ((days - 1) * 25.00) * 0.7;
            }
        } else if (roomType.equals("president apartment")) {
            if (days > 15) {
                totalPrice = ((days - 1) * 35.00) * 0.8;
            } else if (days >= 10) {
                totalPrice = ((days - 1) * 35.00) * 0.85;
            } else if (days >= 0) {
                totalPrice = ((days - 1) * 35.00) * 0.9;
            }
        }

        // Adjust the total price based on the guest rating
        if (rating.equals("positive")) {
            totalPrice *= 1.25; // Increase the price by 25%
        } else if (rating.equals("negative")) {
            totalPrice *= 0.9; // Decrease the price by 10%
        }

        // Display the total price with two decimal places
        System.out.printf("%.2f", totalPrice);
        
        scan.close();
    }
}
