package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input values
        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double clothesPricePerExtra = Double.parseDouble(scan.nextLine());

        // Calculate the setting cost
        double settingCost = budget * 0.1;

        // Calculate the total cost for clothes
        double clothesCost = clothesPricePerExtra * extras;

        // Apply discount for clothes if extras are more than 150
        if (extras > 150) {
            clothesCost *= 0.9;
        }

        // Calculate the remaining budget after expenses
        double remainingBudget = budget - (settingCost + clothesCost);

        // Print the result based on the remaining budget
        if (remainingBudget >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainingBudget);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(remainingBudget));
        }

        scan.close();
    }
}
