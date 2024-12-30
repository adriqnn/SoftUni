package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _05_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        // Add variables
        String accommodation = "";
        String location = season.equals("summer") ? "Alaska" : "Morocco";
        double price = 0;

        // Determine accommodation and price based on budget
        if (budget <= 1000) {
            accommodation = "Camp";
            price = season.equals("summer") ? budget * 0.65 : budget * 0.45;
        } else if (budget <= 3000) {
            accommodation = "Hut";
            price = season.equals("summer") ? budget * 0.80 : budget * 0.60;
        } else {
            accommodation = "Hotel";
            price = budget * 0.90;
        }

        // Print the result
        System.out.printf("%s - %s - %.2f", location, accommodation, price);

        scan.close();
    }
}
