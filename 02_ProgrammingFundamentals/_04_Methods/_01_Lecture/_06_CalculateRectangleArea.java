package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        // Create method that calculates rectangle area
        rectangleArea(width, height);

        scan.close();
    }

    private static void rectangleArea(double width, double height) {
        System.out.printf("%.0f", width * height);
    }
}
