package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _03_RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int sideA = Integer.parseInt(scan.nextLine());
        int sideB = Integer.parseInt(scan.nextLine());

        // Calculate the area
        int areaOfARectangle = sideA * sideB;

        // Print the area
        System.out.println(areaOfARectangle);

        scan.close();
    }
}
