package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _07_HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input dimensions
        double houseHeight = Double.parseDouble(scan.nextLine());
        double houseLength = Double.parseDouble(scan.nextLine());
        double heightOfTheRoof = Double.parseDouble(scan.nextLine());

        // Calculate areas of walls and roof
        double wallsFrontAndBack = ((houseHeight * houseHeight) * 2) - (1.2 * 2);
        double wallsSide = ((houseHeight * houseLength) * 2) - ((1.5 * 1.5) * 2);

        double roofSides = (houseHeight * houseLength) * 2;
        double roofFronts = ((houseHeight * heightOfTheRoof) / 2) * 2;

        // Calculate required liters of green and red paint
        double litersGreenPaint = (wallsFrontAndBack + wallsSide) / 3.4;
        double litersRedPaint = (roofSides + roofFronts) / 4.3;

        // Print the required liters of green and red paint with two decimal places
        System.out.printf("%.2f%n", litersGreenPaint);
        System.out.printf("%.2f%n", litersRedPaint);

        // Close the scanner
        scan.close();
    }
}
