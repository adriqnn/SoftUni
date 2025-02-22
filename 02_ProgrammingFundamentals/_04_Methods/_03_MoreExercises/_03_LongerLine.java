package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.Scanner;

public class _03_LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double a1 = Double.parseDouble(scan.nextLine());
        double b1 = Double.parseDouble(scan.nextLine());
        double a2 = Double.parseDouble(scan.nextLine());
        double b2 = Double.parseDouble(scan.nextLine());

        // Create method that determines the longer line
        printLongerLine(x1, y1, x2, y2, a1, b1, a2, b2);

        scan.close();
    }
    
    private static void printLongerLine(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2) {
        double distance1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        double distance2 = Math.sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1)));

        if (distance1 >= distance2) {
            rectangleDistance(x1, y1, x2, y2);
        } else {
            rectangleDistance(a1, b1, a2, b2);
        }
    }

    private static void rectangleDistance(double x1, double y1, double x2, double y2) {
        double first = Math.sqrt((x1 * x1) + (y1 * y1));
        double second = Math.sqrt((x2 * x2) + (y2 * y2));

        if (first <= second) {
            System.out.printf("(%.0f, %.0f)", x1, y1);
            System.out.printf("(%.0f, %.0f)", x2, y2);
        } else {
            System.out.printf("(%.0f, %.0f)", x2, y2);
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }
    }
}
