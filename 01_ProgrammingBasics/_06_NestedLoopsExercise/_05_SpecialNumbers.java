package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Print all the special numbers
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (num % i == 0 && num % j == 0 && num % k == 0 && num % l == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

        scan.close();
    }
}
