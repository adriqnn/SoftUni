package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variable
        double sum = 0;

        // Sum the coins
        while (!console.equals("Start")) {
            double coins = Double.parseDouble(console);
            
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1.0 || coins == 2.0) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            console = scan.nextLine();
        }

        // Read additional input
        String console2 = scan.nextLine();

        // Use vending machine
        while (!console2.equals("End")) {
            if (console2.equals("Nuts")) {
                sum -= 2.0;
                
                if (sum >= 0) {
                    System.out.printf("Purchased Nuts%n");
                } else {
                    System.out.println("Sorry, not enough money");
                    sum += 2.0;
                }
            } else if (console2.equals("Water")) {
                sum -= 0.7;
                
                if (sum >= 0) {
                    System.out.printf("Purchased Water%n");
                } else {
                    System.out.println("Sorry, not enough money");
                    sum += 0.7;
                }
            } else if (console2.equals("Crisps")) {
                sum -= 1.5;
                
                if (sum >= 0) {
                    System.out.printf("Purchased Crisps%n");
                } else {
                    System.out.println("Sorry, not enough money");
                    sum += 1.5;
                }
            } else if (console2.equals("Soda")) {
                sum -= 0.8;
                
                if (sum >= 0) {
                    System.out.printf("Purchased Soda%n");
                } else {
                    System.out.println("Sorry, not enough money");
                    sum += 0.8;
                }
            } else if (console2.equals("Coke")) {
                sum -= 1.0;
                
                if (sum >= 0) {
                    System.out.printf("Purchased Coke%n");
                } else {
                    System.out.println("Sorry, not enough money");
                    sum += 1.0;
                }
            } else {
                System.out.println("Invalid product");
            }
            
            console2 = scan.nextLine();
        }

        // Print result
        System.out.printf("Change: %.2f", sum);

        scan.close();
    }
}
