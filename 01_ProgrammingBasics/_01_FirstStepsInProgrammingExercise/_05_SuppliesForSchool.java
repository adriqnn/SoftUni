package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        int numberOfPens = Integer.parseInt(scan.nextLine());
        int numberOfSharpies = Integer.parseInt(scan.nextLine());
        int litersOfCleaningSupplies = Integer.parseInt(scan.nextLine());
        int discountPercentage = Integer.parseInt(scan.nextLine());

        // Calculate prices for each type of supply
        double pensPrice = numberOfPens * 5.80;
        double sharpiesPrice = numberOfSharpies * 7.20;
        double cleaningSuppliesPrice = litersOfCleaningSupplies * 1.20;

        // Calculate total price with discount
        double totalPrice = (pensPrice + sharpiesPrice + cleaningSuppliesPrice) * (1 - discountPercentage * 0.01);

        // Print the total price
        System.out.printf("%.2f%n", totalPrice);
        
        scan.close();
    }
}
