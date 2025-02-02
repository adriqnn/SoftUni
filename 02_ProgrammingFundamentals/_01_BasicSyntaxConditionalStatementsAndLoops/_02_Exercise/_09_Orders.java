package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfOrders = Integer.parseInt(scan.nextLine());
        
        // Add variable
        double totalPrice = 0;
        
        // Calculate the price for all the orders
        for (int i = 0; i < numberOfOrders; i++) {
            // Orders
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int daysInMonth = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());

            double priceFormula = ((daysInMonth * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", priceFormula);
            totalPrice += priceFormula;
        }
        
        // Print result
        System.out.printf("Total: $%.2f", totalPrice);

        scan.close();
    }
}
