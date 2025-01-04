package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _04_CarNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int beginning = Integer.parseInt(scan.nextLine());
        int ending = Integer.parseInt(scan.nextLine());

        // Find special car numbers and print them
        for (int i = beginning; i <= ending; i++) {
            for (int j = beginning; j <= ending; j++) {
                for (int k = beginning; k <= ending; k++) {
                    for (int l = beginning; l <= ending; l++) {
                        if ((i > l && ((j + k) % 2 == 0))) {
                            if ((i % 2 == 0) && (l % 2 != 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            } else if ((i % 2 != 0) && (l % 2 == 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);
                            }
                        }
                    }
                }
            }
        }

        scan.close();
    }
}
