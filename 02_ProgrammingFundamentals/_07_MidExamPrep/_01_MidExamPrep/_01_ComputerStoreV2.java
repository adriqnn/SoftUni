package _02_ProgrammingFundamentals._07_MidExamPrep._01_MidExamPrep;

import java.util.Scanner;

public class _01_ComputerStoreV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String userInput = scan.nextLine();

        // Add variable
        double totalWithoutTaxes = 0;

        // Make statistics for the orders
        while (!userInput.equals("regular") && !userInput.equals("special")) {
            double currentPrice = Double.parseDouble(userInput);

            if (currentPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                totalWithoutTaxes += currentPrice;
            }

            totalWithoutTaxes += currentPrice;
            userInput = scan.nextLine();
        }

        double taxes = totalWithoutTaxes * 0.2;
        double finalPrice = totalWithoutTaxes + taxes;

        if (totalWithoutTaxes == 0) {
            System.out.println("Invalid order!");
            return;
        }

        if (userInput.equals("special")) {
            finalPrice = finalPrice * 0.9;
        }

        // Print result
        printReceipt(taxes, finalPrice, totalWithoutTaxes);

        scan.close();
    }

    private static void printReceipt(double taxes, double finalPrice, double totalWithoutTaxes) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", finalPrice);
    }
}
