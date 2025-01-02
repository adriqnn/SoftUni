package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _05_AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String command = scan.nextLine();

        // Initialize the account balance
        double accountBalance = 0;

        while (!command.equals("NoMoreMoney")) {
            double deposit = Double.parseDouble(command);

            // Exit the loop if the amount is invalid
            if (deposit < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            // Update the account balance and display the increase
            accountBalance += deposit;
            System.out.printf("Increase: %.2f%n", deposit);

            command = scan.nextLine();
        }

        // Display the final account balance
        System.out.printf("Total: %.2f", accountBalance);

        scan.close();
    }
}
