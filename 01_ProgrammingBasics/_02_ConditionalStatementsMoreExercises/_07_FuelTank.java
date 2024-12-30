package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _07_FuelTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input: fuel type and fuel amount
        String fuelType = scan.nextLine();
        double fuelAmount = Double.parseDouble(scan.nextLine());

        // Check if the fuel type is valid
        boolean validType = fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas");

        // Initialize a message based on fuel amount
        String fuelTank = fuelAmount < 25 ? String.format("Fill your tank with %s!", fuelType.toLowerCase()) : String.format("You have enough %s.", fuelType.toLowerCase());

        // Check if the fuel type is valid and print the appropriate message
        if (validType) {
            System.out.println(fuelTank);
        } else {
            System.out.println("Invalid fuel!");
        }

        scan.close();
    }
}
