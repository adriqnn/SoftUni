package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercises;

import java.util.Scanner;

public class _03_GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double balance = Double.parseDouble(scan.nextLine());
        String console = scan.nextLine();

        // Add variables
        double budget = balance;
        double spent = 0;

        // Make statistics for game-store
        while (!console.equals("Game Time")) {
            if (console.equals("OutFall 4")) {
                budget -= 39.99;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += 39.99;
                    console = scan.nextLine();
                    continue;
                }

                System.out.println("Bought OutFall 4");
                spent += 39.99;
            } else if (console.equals("CS: OG")) {
                budget -= 15.99;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += 15.99;
                    console = scan.nextLine();
                    continue;
                }

                System.out.println("Bought CS: OG");
                spent += 15.99;
            } else if (console.equals("Zplinter Zell")) {
                budget -= 19.99;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += 19.99;
                    console = scan.nextLine();
                    continue;
                }

                System.out.println("Bought Zplinter Zell");
                spent += 19.99;
            } else if (console.equals("Honored 2")) {
                budget -= 59.99;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += 59.99;
                    console = scan.nextLine();
                    continue;
                }

                System.out.println("Bought Honored 2");
                spent += 59.99;
            } else if (console.equals("RoverWatch")) {
                budget -= 29.99;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += 29.99;
                    console = scan.nextLine();
                    continue;
                }

                System.out.println("Bought RoverWatch");
                spent += 29.99;
            } else if (console.equals("RoverWatch Origins Edition")) {
                budget -= 39.99;

                if (budget < 0) {
                    System.out.println("Too Expensive");
                    budget += 39.99;
                    console = scan.nextLine();
                    continue;
                }

                System.out.println("Bought RoverWatch Origins Edition");
                spent += 39.99;
            } else {
                System.out.println("Not Found");
            }

            if (budget == 0) {
                System.out.println("Out of money!");
                break;
            }

            console = scan.nextLine();
        }

        // Print result
        if (console.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance - spent);
        }

        scan.close();
    }
}
