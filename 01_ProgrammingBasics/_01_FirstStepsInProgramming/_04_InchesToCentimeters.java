package _01_ProgrammingBasics._01_FirstStepsInProgramming;

import java.util.Scanner;

public class _04_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inch = Double.parseDouble(scan.nextLine());
        double cm = inch * 2.54;

        System.out.println(cm);
    }
}
