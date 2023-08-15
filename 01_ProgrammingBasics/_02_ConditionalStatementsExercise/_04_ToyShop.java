package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input values
        double travelCost = Double.parseDouble(scan.nextLine());
        double puzzles = Double.parseDouble(scan.nextLine());
        double dolls = Double.parseDouble(scan.nextLine());
        double bears = Double.parseDouble(scan.nextLine());
        double minions = Double.parseDouble(scan.nextLine());
        double trucks = Double.parseDouble(scan.nextLine());

        // Calculate the revenue from selling each type of toy
        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3.00;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2.00;

        // Calculate the total revenue and number of sold toys
        double allToys = puzzles + dolls + bears + minions + trucks;
        double totalSum = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        // Apply discount if the number of sold toys is 50 or more
        if (allToys >= 50) {
            totalSum *= 0.75; // 25% discount
        }

        // Subtract rent and check if there's enough money for travel
        double sumAfterRent = totalSum * 0.9; // 10% for rent
        double moneyLeft = sumAfterRent - travelCost;

        // Print the result
        if (moneyLeft >= 0) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyLeft));
        }
        
        scan.close();
    }
}
