package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scan.nextLine());
        int fishMenus = Integer.parseInt(scan.nextLine());
        int vegetarianMenus = Integer.parseInt(scan.nextLine());

        double priceForChickenMenus = chickenMenus * 10.35;
        double priceForFishMenus = fishMenus * 12.40;
        double priceForVegetarianMenus = vegetarianMenus * 8.15;
        double totalPriceForMenus = priceForChickenMenus + priceForFishMenus + priceForVegetarianMenus;
        double priceForDesserts = totalPriceForMenus * 0.20;
        double totalPrice = totalPriceForMenus + priceForDesserts + 2.50;

        System.out.println(totalPrice);
    }
}
