package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        double deposit = Double.parseDouble(scan.nextLine());
        int interestPeriod = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());

        // Calculate yearly and monthly interest
        double yearlyInterest = deposit * (interestRate * 1 / 100);
        double monthlyInterest = yearlyInterest / 12;

        // Calculate final deposit amount
        double finalDeposit = deposit + (monthlyInterest * interestPeriod);

        // Print the final deposit amount
        System.out.println(finalDeposit);

        // Close the scanner
        scan.close();
    }
}
