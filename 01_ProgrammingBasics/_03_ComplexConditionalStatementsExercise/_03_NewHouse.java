package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String flowerType = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double totalCost = 0;

        // Calculate the total cost based on flower type and quantity
        switch (flowerType) {
            case "Roses":
                if (quantity <= 80) {
                    totalCost = quantity * 5.00;
                } else {
                    totalCost = (quantity * 5.00) * 0.9;
                }
                break;
            case "Dahlias":
                if (quantity <= 90) {
                    totalCost = quantity * 3.80;
                } else {
                    totalCost = (quantity * 3.80) * 0.85;
                }
                break;
            case "Tulips":
                if (quantity <= 80) {
                    totalCost = quantity * 2.80;
                } else {
                    totalCost = (quantity * 2.80) * 0.85;
                }
                break;
            case "Narcissus":
                if (quantity < 120) {
                    totalCost = (quantity * 3.00) * 1.15;
                } else {
                    totalCost = quantity * 3.00;
                }
                break;
            default: // For "Gladiolus" or other types
                if (quantity < 80) {
                    totalCost = (quantity * 2.50) * 1.2;
                } else {
                    totalCost = quantity * 2.50;
                }
                break;
        }

        // Calculate the difference between budget and total cost
        double difference = Math.abs(budget - totalCost);

        // Check if the flower type and quantity are valid
        boolean isValidFlower = totalCost != 0;

        // Determine the appropriate output based on budget
        if (isValidFlower) {
            if (budget >= totalCost) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", quantity, flowerType, difference);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.%n", difference);
            }
        }
        
        scan.close();
    }
}
