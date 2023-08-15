package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input values
        double budget = Double.parseDouble(scan.nextLine());
        double gpus = Double.parseDouble(scan.nextLine());
        double processors = Double.parseDouble(scan.nextLine());
        int memorySticks = Integer.parseInt(scan.nextLine());

        // Calculate the prices of each component
        double gpusPrice = gpus * 250;
        double processorsPrice = processors * (gpusPrice * 0.35);
        double memoryPrice = memorySticks * (gpusPrice * 0.1);

        // Calculate the total price
        double totalPrice = gpusPrice + processorsPrice + memoryPrice;

        // Apply discount if GPUs are more expensive than processors
        if (gpus > processors) {
            totalPrice *= 0.85;
        }

        // Compare the total price with the budget and print the result
        if (totalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
        
        scan.close();
    }
}
