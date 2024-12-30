package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int numberOfPeople = Integer.parseInt(scan.nextLine());

        double basePrice = 0;
        boolean isAutumn = season.equals("Autumn");

        // Calculate the base price based on the season
        // Apply discounts based on the number of people
        switch (season) {
            case "Spring":
                basePrice = 3000;
                if (numberOfPeople <= 6) {
                    basePrice *= 0.90;
                } else if (numberOfPeople <= 11) {
                    basePrice *= 0.85;
                } else {
                    basePrice *= 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                basePrice = 4200;
                if (numberOfPeople <= 6) {
                    basePrice *= 0.90;
                } else if (numberOfPeople <= 11) {
                    basePrice *= 0.85;
                } else {
                    basePrice *= 0.75;
                }
                break;
            case "Winter":
                basePrice = 2600;
                if (numberOfPeople <= 6) {
                    basePrice *= 0.90;
                } else if (numberOfPeople <= 11) {
                    basePrice *= 0.85;
                } else {
                    basePrice *= 0.75;
                }
                break;
        }

        // Apply additional adjustments based on season and odd/even number of people
        if (isAutumn) {
            basePrice *= 1.00;
        } else {
            if (numberOfPeople % 2 == 0) {
                basePrice *= 0.95;
            } else {
                basePrice *= 1.00;
            }
        }

        double difference = budget - basePrice;

        // Determine the appropriate output based on budget
        if (budget >= basePrice) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(difference));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(difference));
        }

        scan.close();
    }
}
