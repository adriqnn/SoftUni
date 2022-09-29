package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _09_YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sqrMetersPlot = Double.parseDouble(scan.nextLine());

        double costOfGreening = sqrMetersPlot * 7.61;
        double discount = costOfGreening * 0.18;
        double costWithDiscount = costOfGreening - discount;

        System.out.println("The final price is:" + " " + costWithDiscount + " lv.");
        System.out.println("The discount is:" +" " + discount + " lv.");
    }
}
