package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value in inches
        double inches = Double.parseDouble(scan.nextLine());

        // Convert inches to centimeters
        double centimeters = inches * 2.54;

        // Print the result in centimeters
        System.out.println(centimeters);

        scan.close();
    }
}
