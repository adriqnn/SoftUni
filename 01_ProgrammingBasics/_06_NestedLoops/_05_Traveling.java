package _01_ProgrammingBasics._06_NestedLoops;

import java.util.Scanner;

public class _05_Traveling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String console = scan.nextLine();
        String destination = "";

        while (!console.equals("End")) {
            // Store the current destination
            destination = console;

            double budget = Double.parseDouble(scan.nextLine());
            double sum = 0;

            while (sum < budget) {
                double expense = Double.parseDouble(scan.nextLine());
                sum += expense;
            }

            // Print the destination you're going to
            System.out.printf("Going to %s!%n", destination);

            // Read the next destination or "End" to exit the loop
            console = scan.nextLine();
        }

        scan.close();
    }
}
