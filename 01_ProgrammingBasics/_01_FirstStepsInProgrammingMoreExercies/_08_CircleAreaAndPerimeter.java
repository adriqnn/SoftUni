package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _08_CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the radius input
        double r = Double.parseDouble(scan.nextLine());

        // Calculate circle area and perimeter
        double circleArea = Math.PI * r * r;
        double circlePerimeter = 2 * Math.PI * r;

        // Print the calculated area and perimeter
        System.out.printf("%.2f%n", circleArea);
        System.out.printf("%.2f%n", circlePerimeter);

        scan.close();
    }
}
