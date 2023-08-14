package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        double coveringPlastic = Double.parseDouble(scan.nextLine());
        double paintInLiters = Double.parseDouble(scan.nextLine());
        double paintRemoverInLiters = Double.parseDouble(scan.nextLine());
        double hoursOfWork = Double.parseDouble(scan.nextLine());

        // Calculate prices for each material
        double coveringPlasticPrice = ((coveringPlastic + 2) * 1.50) + 0.40;
        double paintPrice = (paintInLiters * 1.1) * 14.50;
        double paintRemoverPrice = paintRemoverInLiters * 5.00;

        // Calculate total cost for materials
        double totalForMaterials = coveringPlasticPrice + paintPrice + paintRemoverPrice;

        // Calculate cost for labor
        double workPrice = totalForMaterials * 0.3 * hoursOfWork;

        // Calculate the final total cost
        double totalCost = totalForMaterials + workPrice;

        // Print the final total cost
        System.out.printf("%.2f%n", totalCost);
        
        scan.close();
    }
}
