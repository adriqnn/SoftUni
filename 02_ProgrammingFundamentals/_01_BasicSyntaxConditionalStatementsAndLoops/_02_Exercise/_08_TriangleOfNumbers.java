package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print triangle of numbers
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            
            System.out.println();
        }

        scan.close();
    }
}
