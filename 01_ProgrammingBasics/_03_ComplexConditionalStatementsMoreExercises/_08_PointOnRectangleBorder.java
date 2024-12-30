package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _08_PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input for rectangle point one
        double sqrX1 = Double.parseDouble(scan.nextLine());
        double sqrY1 = Double.parseDouble(scan.nextLine());

        // Read input for rectangle point two
        double sqrX2 = Double.parseDouble(scan.nextLine());
        double sqrY2 = Double.parseDouble(scan.nextLine());

        // Read input for the point
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        // Determine if the point is on the border of the rectangle and print the result
        if (y == sqrY1 && sqrX1 <= x && x <= sqrX2) {
            System.out.println("Border");
        } else if (y == sqrY2 && sqrX1 <= x && x <= sqrX2) {
            System.out.println("Border");
        } else if (x == sqrX1 && sqrY1 <= y && y <= sqrY2 ) {
            System.out.println("Border");
        } else if (x == sqrX2 && sqrY1 <= y && y <= sqrY2) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

        scan.close();
    }
}
