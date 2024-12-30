package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _05_Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int days = Integer.parseInt(scan.nextLine());
        int kilogramsOfFood = Integer.parseInt(scan.nextLine());
        double dogFoodInKilograms = Double.parseDouble(scan.nextLine());
        double catFoodInKilograms = Double.parseDouble(scan.nextLine());
        double turtleFoodInGrams = Double.parseDouble(scan.nextLine());

        // Calculate food needed for each pet
        double dogFoodNeeded = dogFoodInKilograms * days;
        double catFoodNeeded = catFoodInKilograms * days;
        double turtleFoodNeeded = (turtleFoodInGrams * days) / 1000;

        // Calculate total food needed
        double foodNeeded = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;

        // Calculate remaining food
        double remainingFood = kilogramsOfFood - foodNeeded;

        // Print the result
        if (remainingFood >= 0) {
            System.out.printf("%.0f kilos of food left.", Math.floor(remainingFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(remainingFood)));
        }

        scan.close();
    }
}
