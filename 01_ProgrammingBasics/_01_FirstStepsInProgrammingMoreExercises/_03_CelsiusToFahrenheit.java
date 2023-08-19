package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercises;

import java.util.Scanner;

public class _03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input temperature in Celsius
        double degreesInCelsius = Double.parseDouble(scan.nextLine());

        // Convert Celsius to Fahrenheit
        double turnCelsiusToFahrenheit = (degreesInCelsius * 9 / 5) + 32;

        // Print the converted temperature in Fahrenheit
        System.out.printf("%.2f%n", turnCelsiusToFahrenheit);

        scan.close();
    }
}
