package _01_Programming_Basics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double deposit = Double.parseDouble(scan.nextLine());
        int interestPeriod = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());

        double yearlyInterest = deposit * (interestRate * 1/100);
        double monthlyInterest = yearlyInterest/12;

        System.out.println(deposit + (monthlyInterest * interestPeriod));
    }
}
