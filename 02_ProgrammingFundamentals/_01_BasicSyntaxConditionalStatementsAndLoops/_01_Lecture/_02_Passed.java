package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _02_Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        double grade = Double.parseDouble(scan.nextLine());

        // Print result
        if (grade >= 3.00) {
            System.out.println("Passed!");
        }

        scan.close();
    }
}
