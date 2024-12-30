package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _03_Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input values
        double yardSquareMeters = Double.parseDouble(scan.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scan.nextLine());
        double requiredLitersOfWine = Double.parseDouble(scan.nextLine());
        double numberOfWorkers = Double.parseDouble(scan.nextLine());

        // Calculate grape and wine production
        double grapeForWine = (yardSquareMeters * grapesPerSquareMeter) * 0.4;
        double litersOfWine = grapeForWine / 2.5;

        double wine = requiredLitersOfWine - litersOfWine;

        // Print the result
        if (wine <= 0) {
            // Enough wine for everyone
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(litersOfWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(Math.abs(wine)), Math.ceil(Math.abs(wine) / numberOfWorkers));
        } else {
            // Not enough wine
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(Math.abs(wine)));
        }

        scan.close();
    }
}
