package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _03_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Find the numbers based on the requirement and print them
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i + j) == (k + l)) {
                            int num = Integer.parseInt(String.format("%d%d%d%d", i, j, k, l));
                            int sum = i + j;
                            
                            if (n % sum == 0) {
                                System.out.printf("%d ", num);
                            }
                        }
                    }
                }
            }
        }

        scan.close();
    }
}
