package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _08_FuelTank2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input: fuel type, fuel amount, and club card status
        String fuelType = scan.nextLine();
        double fuelAmount = Double.parseDouble(scan.nextLine());
        String clubCard = scan.nextLine().toLowerCase();

        // Initialize variable to store the price of the fuel
        double priceOfTheFuel = 0;

        // Calculate fuel price based on club card status and fuel type
        if (clubCard.equals("yes")) {
            if (fuelType.equals("Gasoline")) {
                priceOfTheFuel = fuelAmount * 2.04;
            } else if (fuelType.equals("Diesel")) {
                priceOfTheFuel = fuelAmount * 2.21;
            } else if (fuelType.equals("Gas")) {
                priceOfTheFuel = fuelAmount * 0.85;
            }
        } else {
            if (fuelType.equals("Gasoline")) {
                priceOfTheFuel = fuelAmount * 2.22;
            } else if (fuelType.equals("Diesel")) {
                priceOfTheFuel = fuelAmount * 2.33;
            } else if (fuelType.equals("Gas")) {
                priceOfTheFuel = fuelAmount * 0.93;
            }
        }

        // Apply discounts based on fuel amount
        if (fuelAmount >= 20 && fuelAmount <= 25) {
            priceOfTheFuel *= 0.92;
        } else if (fuelAmount > 25) {
            priceOfTheFuel *= 0.90;
        }

        // Print the final price of the fuel
        System.out.printf("%.2f lv.", priceOfTheFuel);

        scan.close();
    }
}
