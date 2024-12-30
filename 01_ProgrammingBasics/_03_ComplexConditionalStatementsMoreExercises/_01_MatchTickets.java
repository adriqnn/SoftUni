package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _01_MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double budget = Double.parseDouble(scan.nextLine());
        String category = scan.nextLine().toLowerCase();
        int people = Integer.parseInt(scan.nextLine());

        // Set variable for cost values
        double transportCost = 0;
        double ticketsCost = 0;

        // Determine transport cost
        if (people <= 4) {
            transportCost = budget * 0.75;
        } else if (people <= 9) {
            transportCost = budget * 0.60;
        } else if (people <= 24) {
            transportCost = budget * 0.50;
        } else if (people <= 49) {
            transportCost = budget * 0.40;
        } else {
            transportCost = budget * 0.25;
        }

        // Determine ticket cost
        if (category.equals("vip")) {
            ticketsCost = people * 499.99;
        } else {
            ticketsCost = people * 249.99;
        }

        // Calculate total outcome for budget
        double calculateBudget = budget - (transportCost + ticketsCost);

        // Print result based on budget value
        if (calculateBudget < 0) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(calculateBudget));
        } else {
            System.out.printf("Yes! You have %.2f leva left.", calculateBudget);
        }

        scan.close();
    }
}
