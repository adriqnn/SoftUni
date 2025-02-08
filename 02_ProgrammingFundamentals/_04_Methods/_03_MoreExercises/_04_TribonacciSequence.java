package _02_ProgrammingFundamentals._04_Methods._03_MoreExercises;

import java.util.Scanner;

public class _04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print tribonacci sequence
        tribonacciSequence(n);

        scan.close();
    }

    private static void tribonacciSequence(int n) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;

        if (n == 0) {
            System.out.println("0");
            return;
        }

        if (n == 1) {
            System.out.println("1");
            return;
        }

        if (n == 2) {
            System.out.println("1 1");
            return;
        }

        System.out.print("1 ");
        System.out.print("1 ");

        for (int i = 3; i <= n; i++) {
            int temp1 = n1;
            int temp2 = n2;

            System.out.print(n3 + " ");

            n1 = n2;
            n2 = n3;

            n3 += temp1 + temp2;
        }
    }
}
