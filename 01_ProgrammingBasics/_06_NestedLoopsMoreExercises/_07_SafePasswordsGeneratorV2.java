package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _07_SafePasswordsGeneratorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());

        // Add variables
        int A = 35; // ASCII value of '#'
        int B = 64; // ASCII value of '@'
        int count = 0;

        // Print generated passwords
        forOuter:
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (count == max) {
                    break forOuter;
                }

                System.out.printf("%c%c%d%d%c%c|", A, B, i, j, B, A);
                count++;

                A = (A == 55) ? 35 : A + 1;
                B = (B == 96) ? 64 : B + 1;
            }
        }

        scan.close();
    }
}
