package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfDays = Integer.parseInt(scan.nextLine());
        int numberOfHoursPerDay = Integer.parseInt(scan.nextLine());

        // Add variable
        double totalSum = 0;

        // Calculate daily parking fee
        for (int day = 1; day <= numberOfDays; day++) {
            double dailySum = 0;
            
            for (int hour = 1; hour <= numberOfHoursPerDay; hour++) {
                if (day % 2 != 0) {
                    if (hour % 2 == 0) {
                        dailySum += 1.25;
                    } else {
                        dailySum += 1;
                    }
                } else {
                    if (hour % 2 != 0) {
                        dailySum += 2.50;
                    } else {
                        dailySum += 1;
                    }
                }
            }

            totalSum += dailySum;
            System.out.printf("Day: %d - %.2f leva%n", day, dailySum);
        }

        // Print the total amount
        System.out.printf("Total: %.2f leva", totalSum);

        scan.close();
    }
}
