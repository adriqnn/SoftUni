package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());

        // Print result from the factorial division method
        System.out.printf("%.2f", (1.00 * factorialDivision(n1)) / factorialDivision(n2));

        scan.close();
    }

    private static long factorialDivision(int n) {
        long factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
