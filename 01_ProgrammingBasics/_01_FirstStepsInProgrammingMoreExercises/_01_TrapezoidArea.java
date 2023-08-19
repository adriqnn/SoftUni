package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercises;

import java.util.Scanner;

public class _01_TrapezoidArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        double basisOne = Double.parseDouble(scan.nextLine());
        double basisTwo = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        // Calculate the area of the trapezoid
        double trapezoidArea = (basisOne + basisTwo) * height / 2;

        // Print the calculated area with two decimal places
        System.out.printf("%.2f%n", trapezoidArea);

        scan.close();
    }
}
