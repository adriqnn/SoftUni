package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _10_Profit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int coinsOne = Integer.parseInt(scan.nextLine());
        int coinsTwo = Integer.parseInt(scan.nextLine());
        int coinsFive = Integer.parseInt(scan.nextLine());
        int sum = Integer.parseInt(scan.nextLine());

        // Print all possible combinations
        for (int i = 0; i <= coinsOne; i++) {
            for (int j = 0; j <= coinsTwo; j++) {
                for (int k = 0; k <= coinsFive; k++) {
                    if (((i * 1) + (j * 2) + (k * 5)) == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }

        scan.close();
    }
}
