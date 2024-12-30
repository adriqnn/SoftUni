package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _07_HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String month = scan.nextLine().toLowerCase();
        int nights = Integer.parseInt(scan.nextLine());

        double days = (nights * 1.00);

        double studio = 0;
        double apartment = 0;

        // Calculate prices for studio and apartment based on month and number of nights
        if (month.equals("may") || month.equals("october")) {
            if (nights > 14) {
                studio = (days * 50.00) * 0.70;
                apartment = (days * 65.00) * 0.90;
            } else if (nights > 7) {
                studio = (days * 50.00) * 0.95;
                apartment = (days * 65.00);
            } else {
                studio = (days * 50.00);
                apartment = (days * 65.00);
            }
        } else if (month.equals("june") || month.equals("september")) {
            if (nights > 14) {
                studio = (days * 75.20) * 0.80;
                apartment = (days * 68.70) * 0.90;
            } else {
                studio = (days * 75.20);
                apartment = (days * 68.70);
            }
        } else if (month.equals("july") || month.equals("august")) {
            studio = 76.00;
            apartment = 77.00;
            if (nights > 14) {
                studio = (days * 76.00);
                apartment = (days * 77.00) * 0.90;
            } else {
                studio = (days * 76.00);
                apartment = (days * 77.00);
            }
        }

        // Display the calculated prices for studio and apartment
        System.out.printf("Apartment: %.2f lv.\n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);

        scan.close();
    }
}
