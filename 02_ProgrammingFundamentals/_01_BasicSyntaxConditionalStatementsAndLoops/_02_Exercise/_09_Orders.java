package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfOrders = Integer.parseInt(scan.nextLine());
        double totalPrice = 0;


        for (int i = 0; i < numberOfOrders; i++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int daysInMonth = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());

            double priceFormula = ((daysInMonth * capsulesCount) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n", priceFormula);
            totalPrice += priceFormula;
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
