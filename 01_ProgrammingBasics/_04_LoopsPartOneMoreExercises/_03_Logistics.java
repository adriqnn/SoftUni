package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _03_Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int cargoCount = Integer.parseInt(scan.nextLine());

        // Add variables
        double totalCargoTransported = 0;
        double totalPrice = 0;
        double cargoByBus = 0;
        double cargoByTruck = 0;
        double cargoByTrain = 0;

        // Process each cargo and calculate statistics
        for (int i = 0; i < cargoCount; i++) {
            double cargoWeight = Double.parseDouble(scan.nextLine());

            if (cargoWeight <= 3) {
                cargoByBus += cargoWeight;
                totalPrice += cargoWeight * 200;
            } else if (cargoWeight <= 11) {
                cargoByTruck += cargoWeight;
                totalPrice += cargoWeight * 175;
            } else {
                cargoByTrain += cargoWeight;
                totalPrice += cargoWeight * 120;
            }

            totalCargoTransported += cargoWeight;
        }

        // Calculate and print the statistics
        System.out.printf("%.2f%n", totalPrice / totalCargoTransported);
        System.out.printf("%.2f%%%n", cargoByBus / totalCargoTransported * 100);
        System.out.printf("%.2f%%%n", cargoByTruck / totalCargoTransported * 100);
        System.out.printf("%.2f%%%n", cargoByTrain / totalCargoTransported * 100);

        scan.close();
    }
}
