package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int degrees = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        String outfit = "";
        String shoes = "";

        // Determine outfit and shoes based on temperature and part of the day
        if ("Morning".equals(dayTime)) {
            if (degrees >= 10 && degrees <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrees > 18 && degrees <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if ("Afternoon".equals(dayTime)) {
            if (degrees <= 18 && degrees >= 10) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees <= 24 && degrees > 18) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if ("Evening".equals(dayTime)) {
            if (degrees <= 18 && degrees >= 10) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrees <= 24 && degrees > 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        // Display the suggested outfit and shoes based on conditions
        System.out.printf("It's %d degrees, get your %s and %s.%n", degrees, outfit, shoes);

        scan.close();
    }
}
