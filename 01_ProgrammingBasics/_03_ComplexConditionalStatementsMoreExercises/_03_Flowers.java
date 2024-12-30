package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _03_Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int tulips = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine().toLowerCase();
        String holiday = scan.nextLine().toLowerCase();

        // Add helpful variables
        double flowerCost = 0;
        int allFlowersBought = chrysanthemums + roses + tulips;
        boolean isHoliday = holiday.equals("y");

        // Calculate initial price based on season
        if (season.equals("spring") || season.equals("summer")) {
            flowerCost = (chrysanthemums * 2.00) + (roses * 4.10) + (tulips * 2.50);
        } else {
            flowerCost = (chrysanthemums * 3.75) + (roses * 4.50) + (tulips * 4.15);
        }

        // Add price increase based on holiday
        if (isHoliday) {
            flowerCost *= 1.15;
        }

        // Add discount based on season and flower type count
        if (season.equals("spring") && tulips > 7) {
            flowerCost *= 0.95;
        } else if (season.equals("winter") && roses >= 10){
            flowerCost *= 0.90;
        }

        // Add discount on overall flower count
        if (allFlowersBought >= 20) {
            flowerCost *= 0.8;
        }

        // Add arrangement price
        flowerCost += 2;

        // Print the result
        System.out.printf("%.2f", flowerCost);

        scan.close();
    }
}
