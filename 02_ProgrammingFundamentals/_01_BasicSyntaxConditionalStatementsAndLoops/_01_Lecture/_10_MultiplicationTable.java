package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value 
        int n = Integer.parseInt(scan.nextLine());

        // Print multiplication table for a given number
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }

        scan.close();
    }
}
