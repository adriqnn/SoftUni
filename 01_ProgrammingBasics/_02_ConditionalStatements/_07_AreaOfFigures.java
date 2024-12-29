package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the shape input
        String shape = scan.nextLine();

        // Read additional information based on the shape, calculate and print the area of the shape
        if (shape.equals("square")) {
            double squareSide = Double.parseDouble(scan.nextLine());
            double squareArea = squareSide * squareSide;
            
            System.out.printf("%.3f", squareArea);
        } else if (shape.equals("rectangle")) {
            double rectangleWidth = Double.parseDouble(scan.nextLine());
            double rectangleHeight = Double.parseDouble(scan.nextLine());
            double rectangleArea = rectangleWidth * rectangleHeight;
            
            System.out.printf("%.3f", rectangleArea);
        } else if (shape.equals("circle")) {
            double circleRadius = Double.parseDouble(scan.nextLine());
            double circleArea = Math.PI * circleRadius * circleRadius;
            
            System.out.printf("%.3f", circleArea);
        } else if (shape.equals("triangle")) {
            double triangleBase = Double.parseDouble(scan.nextLine());
            double triangleHeight = Double.parseDouble(scan.nextLine());
            double triangleArea = (triangleBase * triangleHeight) / 2;
            
            System.out.printf("%.3f", triangleArea);
        }
        
        scan.close();
    }
}
