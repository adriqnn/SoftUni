package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _05_SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values from console
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        // Prices in Sofia
        final double SOFIA_COFFEE_PRICE = 0.50;
        final double SOFIA_WATER_PRICE = 0.80;
        final double SOFIA_BEER_PRICE = 1.20;
        final double SOFIA_SWEETS_PRICE = 1.45;
        final double SOFIA_PEANUTS_PRICE = 1.60;

        // Prices in Plovdiv
        final double PLOVDIV_COFFEE_PRICE = 0.40;
        final double PLOVDIV_WATER_PRICE = 0.70;
        final double PLOVDIV_BEER_PRICE = 1.15;
        final double PLOVDIV_SWEETS_PRICE = 1.30;
        final double PLOVDIV_PEANUTS_PRICE = 1.50;

        // Prices in Varna
        final double VARNA_COFFEE_PRICE = 0.45;
        final double VARNA_WATER_PRICE = 0.70;
        final double VARNA_BEER_PRICE = 1.10;
        final double VARNA_SWEETS_PRICE = 1.35;
        final double VARNA_PEANUTS_PRICE = 1.55;

        double totalPrice = 0;

        // Calculate the profit based on town
        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    totalPrice = quantity * SOFIA_COFFEE_PRICE;
                    break;
                case "water":
                    totalPrice = quantity * SOFIA_WATER_PRICE;
                    break;
                case "beer":
                    totalPrice = quantity * SOFIA_BEER_PRICE;
                    break;
                case "sweets":
                    totalPrice = quantity * SOFIA_SWEETS_PRICE;
                    break;
                case "peanuts":
                    totalPrice = quantity * SOFIA_PEANUTS_PRICE;
                    break;
            }
        } else if (town.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    totalPrice = quantity * PLOVDIV_COFFEE_PRICE;
                    break;
                case "water":
                    totalPrice = quantity * PLOVDIV_WATER_PRICE;
                    break;
                case "beer":
                    totalPrice = quantity * PLOVDIV_BEER_PRICE;
                    break;
                case "sweets":
                    totalPrice = quantity * PLOVDIV_SWEETS_PRICE;
                    break;
                case "peanuts":
                    totalPrice = quantity * PLOVDIV_PEANUTS_PRICE;
                    break;
            }
        } else if (town.equals("Varna")) {
            switch (product) {
                case "coffee":
                    totalPrice = quantity * VARNA_COFFEE_PRICE;
                    break;
                case "water":
                    totalPrice = quantity * VARNA_WATER_PRICE;
                    break;
                case "beer":
                    totalPrice = quantity * VARNA_BEER_PRICE;
                    break;
                case "sweets":
                    totalPrice = quantity * VARNA_SWEETS_PRICE;
                    break;
                case "peanuts":
                    totalPrice = quantity * VARNA_PEANUTS_PRICE;
                    break;
            }
        }

        // Print the result total price
        System.out.printf("Total price: %.2f%n", totalPrice);

        scan.close();
    }
}
