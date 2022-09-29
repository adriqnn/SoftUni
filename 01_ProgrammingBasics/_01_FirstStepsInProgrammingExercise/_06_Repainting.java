package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _06_Repainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double coveringPlastic = Integer.parseInt(scan.nextLine());
        double paintInLiters = Integer.parseInt(scan.nextLine());
        double paintRemoverInLiters = Integer.parseInt(scan.nextLine());
        double hoursOfWork = Integer.parseInt(scan.nextLine());

        double coveringPlasticPrice = ((coveringPlastic + 2) * 1.50) + 0.40;
        double paintPrice = (paintInLiters * 1.1) * 14.50;
        double paintRemoverPrice = paintRemoverInLiters * 5.00;
        double totalForMaterials = coveringPlasticPrice + paintPrice + paintRemoverPrice;
        double workPrice = totalForMaterials * 0.3 * hoursOfWork;

        System.out.println(totalForMaterials + workPrice);
    }
}
