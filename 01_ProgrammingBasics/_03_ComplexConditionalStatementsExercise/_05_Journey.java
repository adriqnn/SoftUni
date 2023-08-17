package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        double price = 0;
        String destination = "";
        String accommodation = "";

        // Determine the destination and accommodation based on budget and season
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                accommodation = "Camp";
                price = budget * 0.30;
            } else if (season.equals("winter")) {
                accommodation = "Hotel";
                price = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                accommodation = "Camp";
                price = budget * 0.40;
            } else if (season.equals("winter")) {
                accommodation = "Hotel";
                price = budget * 0.80;
            }
        } else {
            destination = "Europe";
            accommodation = "Hotel";
            price = budget * 0.90;
        }

        double difference = budget - price;

        // Determine the appropriate output based on budget
        if (budget >= price) {
            System.out.printf("Somewhere in %s%n", destination);
            System.out.printf("%s - %.2f%n", accommodation, price);
        }
        
        scan.close();
    }
}
