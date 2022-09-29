package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shape = scan.nextLine();

        if (shape.equals("square")) {
            double square = Double.parseDouble(scan.nextLine());
            double square2 = square * square;

            System.out.printf("%.3f", square2);

        } else if (shape.equals("rectangle")) {
            double rectangle = Double.parseDouble(scan.nextLine());
            double rectangle2 = Double.parseDouble(scan.nextLine());
            double rectangle3 = rectangle * rectangle2;

            System.out.printf("%.3f", rectangle3);

        } else if (shape.equals("circle")) {
            double circle = Double.parseDouble(scan.nextLine());
            double circle2 = Math.PI * circle * circle;

            System.out.printf("%.3f", circle2);

        } else if (shape.equals("triangle")) {
            double triangle = Double.parseDouble(scan.nextLine());
            double triangle2 = Double.parseDouble(scan.nextLine());
            double triangle3 = triangle * triangle2;
            double triangle4 = triangle3 / 2;

            System.out.printf("%.3f", triangle4);
        }
    }
}
