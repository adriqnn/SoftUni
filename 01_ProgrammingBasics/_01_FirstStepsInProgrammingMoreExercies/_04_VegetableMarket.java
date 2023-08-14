package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input prices and kilograms
        double priceForKilogramVegetables = Double.parseDouble(scan.nextLine());
        double priceForKilogramFruits = Double.parseDouble(scan.nextLine());
        int kilogramsVegetables = Integer.parseInt(scan.nextLine());
        int kilogramsFruits = Integer.parseInt(scan.nextLine());

        // Calculate total revenue
        double revenueInEuro = ((priceForKilogramVegetables * kilogramsVegetables) + (priceForKilogramFruits * kilogramsFruits)) / 1.94;

        // Print the total revenue
        System.out.printf("%.2f%n", revenueInEuro);

        scan.close();
    }
}
