package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _06_TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String season = scan.nextLine().toLowerCase();
        double kilometersPerMonth = Double.parseDouble(scan.nextLine());

        // Add variables
        double courseCost = 0;

        // Calculate the cost of the course based on the kilometers and season, and removing the tax
        if (kilometersPerMonth <= 5000) {
            if (season.equals("spring") || season.equals("autumn")) {
                courseCost = kilometersPerMonth * 0.75 * 4 * 0.90;
            } else if (season.equals("summer")) {
                courseCost = kilometersPerMonth * 0.90 * 4 * 0.90;
            } else {
                courseCost = kilometersPerMonth * 1.05 * 4 * 0.90;
            }
        } else if (kilometersPerMonth <= 10000) {
            if (season.equals("spring") || season.equals("autumn")) {
                courseCost = kilometersPerMonth * 0.95 * 4 * 0.90;
            } else if (season.equals("summer")) {
                courseCost = kilometersPerMonth * 1.10 * 4 * 0.90;
            } else {
                courseCost = kilometersPerMonth * 1.25 * 4 * 0.90;
            }
        } else {
            courseCost = kilometersPerMonth * 1.45 * 4 * 0.90;
        }

        // Print the result
        System.out.printf("%.2f", courseCost);

        scan.close();
    }
}
