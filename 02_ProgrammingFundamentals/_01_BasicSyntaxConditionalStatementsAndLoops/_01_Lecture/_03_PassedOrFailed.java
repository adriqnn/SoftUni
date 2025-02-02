package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        double grade = Double.parseDouble(scan.nextLine());

        // Print result
        if (grade >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        scan.close();
    }
}
