package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String console = scan.nextLine();
        int n = Integer.parseInt(console);

        // Add variable
        int sum = 0;

        // Sum values
        for (int i = 0; i < console.length(); i++) {
            char symbol = console.charAt(i);
            int num = Character.getNumericValue(symbol);

            int factorial = 1;
            for (int j = 1; j <= num; j++) {
                factorial = factorial * j;
            }

            sum += factorial;
        }

        // Print result
        if (sum == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scan.close();
    }
}
