package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        double triangleSide = Double.parseDouble(scan.nextLine());
        double triangleHeight = Double.parseDouble(scan.nextLine());

        // Calculate the area of the triangle
        double triangleArea = triangleSide * triangleHeight / 2;

        // Print the calculated area with two decimal places
        System.out.printf("%.2f%n", triangleArea);

        scan.close();
    }
}
