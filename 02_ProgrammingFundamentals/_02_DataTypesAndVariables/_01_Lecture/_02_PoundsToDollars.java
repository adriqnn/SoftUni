package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        double inputPounds = Double.parseDouble(scan.nextLine());

        // Add variable
        double poundsToDollars = inputPounds * 1.36;

        // Print value
        System.out.printf("%.3f", poundsToDollars);

        scan.close();
    }
}
