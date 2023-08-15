package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _08_ToyStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input
        double travelCost = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        // Calculate the revenue from selling each type of toy
        double puzzleRevenue = puzzles * 2.60;
        double dollRevenue = dolls * 3.00;
        double bearRevenue = bears * 4.10;
        double minionRevenue = minions * 8.20;
        double truckRevenue = trucks * 2.00;

        // Calculate the total revenue and number of sold toys
        double totalRevenue = puzzleRevenue + dollRevenue + bearRevenue + minionRevenue + truckRevenue;
        int totalToysSold = puzzles + dolls + bears + minions + trucks;

        // Apply discounts if the number of sold toys is 50 or more
        if (totalToysSold >= 50) {
            totalRevenue *= 0.75; // 25% discount
        }

        // Subtract rent and check if there's enough money for travel
        double profitAfterRent = totalRevenue * 0.9; // 10% for rent
        double moneyLeft = profitAfterRent - travelCost;

        // Print the result
        if (moneyLeft >= 0) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }
        
        scan.close();
    }
}
