package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        // Calculate the volume of the tank in liters
        double volumeInLiters = length * width * height / 1000.0;

        // Calculate the multiplier for water displacement
        double multiplier = (100 - percentage) / 100;

        // Calculate the actual liters of water in the tank
        double litersOfWater = volumeInLiters * multiplier;

        // Print the liters of water
        System.out.println(litersOfWater);
        
        scan.close();
    }
}
