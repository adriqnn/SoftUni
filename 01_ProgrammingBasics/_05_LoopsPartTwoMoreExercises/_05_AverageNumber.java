package _01_ProgrammingBasics._05_LoopsPartTwoMoreExercises;

import java.util.Scanner;

public class _05_AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scan.nextLine());
            sum += number;
        }

        // Print the average
        System.out.printf("%.2f", sum/n);
    }
}
