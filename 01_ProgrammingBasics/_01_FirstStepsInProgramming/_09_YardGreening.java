package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _09_YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        double squareMetersPlot = Double.parseDouble(scan.nextLine());

        // Calculate initial cost of greening and discount
        double costOfGreening = squareMetersPlot * 7.61;
        double discount = costOfGreening * 0.18;

        // Calculate final cost with discount
        double costWithDiscount = costOfGreening - discount;

        // Print results
        System.out.printf("The final price is: %.2f lv.%n", costWithDiscount);
        System.out.printf("The discount is: %.2f lv.%n", discount);

        scan.close();
    }
}
