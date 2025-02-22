package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.Scanner;

public class _02_CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        // Create method that prints the closest point
        rectangleDistance(x1, y1, x2, y2);

        scan.close();
    }

    private static void rectangleDistance(double x1, double y1, double x2, double y2) {
        double first = Math.sqrt((x1 * x1) + (y1 * y1));
        double second = Math.sqrt((x2 * x2) + (y2 * y2));

        if (first <= second) {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        } else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }
}
