package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _06_FishLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input prices and kilos
        double priceOfMackerelPerKilo = Double.parseDouble(scan.nextLine());
        double priceOfSpratPerKilo = Double.parseDouble(scan.nextLine());
        double bonitoKilos = Double.parseDouble(scan.nextLine());
        double scadKilos = Double.parseDouble(scan.nextLine());
        double musselsKilos = Double.parseDouble(scan.nextLine());

        // Calculate prices for each type of fish
        double priceOfBonito = bonitoKilos * (priceOfMackerelPerKilo * 1.6);
        double priceOfScad = scadKilos * (priceOfSpratPerKilo * 1.8);
        double priceOfMussels = musselsKilos * 7.5;

        // Calculate the total sum
        double totalSum = priceOfBonito + priceOfScad + priceOfMussels;

        // Print the total sum with two decimal places
        System.out.printf("%.2f%n", totalSum);

        scan.close();
    }
}
