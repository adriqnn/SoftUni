package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        double meters = Double.parseDouble(scan.nextLine());

        // Add variable
        double transformMetersToKilometers = meters / 1000;

        // Print result
        System.out.printf("%.2f", transformMetersToKilometers);
    }
}
