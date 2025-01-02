package _01_ProgrammingBasics._05_LoopsPartTwoMoreExercises;

import java.util.Scanner;

public class _02_ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double donationGoal = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        // Add variables
        double collectedMoney = 0;
        int order = 1;
        double moneyCash = 0;
        double successfulCashDonations = 0;
        double moneyCard = 0;
        double successfulCardDonations = 0;
        boolean moneyCollected = false;

        // Operations
        while (!input.equals("End")) {
            double currentTransaction = Double.parseDouble(input);

            // Check if it's an even or odd order transaction
            if (order % 2 == 0) {
                if (currentTransaction < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    moneyCard += currentTransaction;
                    collectedMoney += currentTransaction;
                    successfulCashDonations++;
                    System.out.println("Product sold!");
                }
            } else {
                if (currentTransaction > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    moneyCash += currentTransaction;
                    collectedMoney += currentTransaction;
                    successfulCardDonations++;
                    System.out.println("Product sold!");
                }
            }
            
            order++;

            if (collectedMoney >= donationGoal) {
                moneyCollected = true;
                break;
            }
            
            input = scan.nextLine();
        }

        // Display the results
        if (moneyCollected) {
            System.out.printf("Average CS: %.2f%n", moneyCash / successfulCashDonations);
            System.out.printf("Average CC: %.2f%n", moneyCard / successfulCardDonations);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

        scan.close();
    }
}
