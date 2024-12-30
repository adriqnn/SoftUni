package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _04_CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        // Add variables
        String carClass = "";
        double fee = 0;

        // Determine based on season the type of car
        String carType = season.equals("summer") ? "Cabrio" : "Jeep";

        // Determine class type based on budget and calculate fee
        if (budget <= 100) {
            carClass = "Economy class";
            fee = season.equals("summer") ? budget * 0.35 : budget * 0.65;
        } else if(budget <= 500) {
            carClass = "Compact class";
            fee = season.equals("summer") ? budget * 0.45 : budget * 0.80;
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            fee = budget * 0.90;
        }

        // Print the result
        System.out.printf("%s%n", carClass);
        System.out.printf("%s - %.2f%n", carType, fee);

        scan.close();
    }
}
