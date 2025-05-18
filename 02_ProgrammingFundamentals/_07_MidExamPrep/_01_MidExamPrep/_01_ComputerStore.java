package _02_ProgrammingFundamentals._07_MidExamPrep._01_MidExamPrep;

import java.util.Scanner;

public class _01_ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        boolean isRegular = false;
        double price = 0;

        // Make statistics for the orders
        while (!console.equals("special")) {
            if (console.equals("regular")) {
                isRegular = true;
                break;
            }

            double plus = Double.parseDouble(console);

            if (plus < 0) {
                System.out.println("Invalid price!");

                console = scan.nextLine();
                continue;
            }

            price += plus;
            console = scan.nextLine();
        }

        if (price == 0) {
            System.out.println("Invalid order!");
            return;
        }

        double taxes = price * 0.2;
        price = price + taxes;

        // Print result
        if (isRegular) {
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$", price - taxes, taxes, price);
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$", price - taxes, taxes, price * 0.9);
        }

        scan.close();
    }
}
