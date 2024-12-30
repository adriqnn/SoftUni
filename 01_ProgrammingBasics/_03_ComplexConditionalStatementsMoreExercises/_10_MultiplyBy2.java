package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _10_MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        double number = Double.parseDouble(scan.nextLine());

        // Multiply the number by 2 and print
        while (number >= 0) {
            double result = number * 2;

            System.out.printf("Result: %.2f%n", result);

            number = Double.parseDouble(scan.nextLine());
        }

        // End the program if the number is below 0
        if (number < 0) {
            System.out.println("Negative number!");
        }

        scan.close();
    }
}
