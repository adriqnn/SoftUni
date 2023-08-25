package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        int sum = 0;

        // Sum all the odd numbers
        for (int i = 1; i < n * 2; i += 2) {
            sum += i;

            System.out.println(i);
        }

        // Print sum of odd numbers
        System.out.println("Sum: " + sum);

        scan.close();
    }
}
