package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        int chickenMenus = Integer.parseInt(scan.nextLine());
        int fishMenus = Integer.parseInt(scan.nextLine());
        int vegetarianMenus = Integer.parseInt(scan.nextLine());

        // Calculate prices for each type of menu
        double priceForChickenMenus = chickenMenus * 10.35;
        double priceForFishMenus = fishMenus * 12.40;
        double priceForVegetarianMenus = vegetarianMenus * 8.15;

        // Calculate total price for menus
        double totalPriceForMenus = priceForChickenMenus + priceForFishMenus + priceForVegetarianMenus;

        // Calculate price for desserts (20%)
        double priceForDesserts = totalPriceForMenus * 0.20;

        // Calculate the final total price including delivery
        double totalPrice = totalPriceForMenus + priceForDesserts + 2.50;

        // Print the final total price
        System.out.printf("%.2f%n", totalPrice);
        
        scan.close();
    }
}
