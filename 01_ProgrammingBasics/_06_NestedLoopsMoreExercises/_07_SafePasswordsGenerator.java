package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _07_SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int max = Integer.parseInt(scan.nextLine());

        // Add variables
        char A = '#';
        char B = '@';
        int count = 0;

        // Print generated passwords
        forOuter:
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (count == max) {
                    break forOuter;
                }
                
                if (A == 56) {
                    A = '#';
                }
                
                if ( B == 97) {
                    B = '@';
                }

                System.out.printf("%s%s%d%d%s%s|", A, B, i, j, B++, A++);
                count++;
            }
        }

        scan.close();
    }
}
