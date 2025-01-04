package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int startOfInterval = Integer.parseInt(scan.nextLine());
        int endOfInterval = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        // Add variables
        int combinations = 0;
        boolean magicNumberFound = false;

        // Find the combinations if there are any
        forLoopOuter:
        for (int i = startOfInterval; i <= endOfInterval; i++) {
            for (int j = startOfInterval; j <= endOfInterval; j++) {
                combinations++;
                int sum = i + j;

                if (magicNumber == sum) {
                    magicNumberFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, sum);
                    break forLoopOuter;
                }
            }
        }

        // Print a message if there are no combinations
        if (!magicNumberFound) {
            System.out.printf("%d combinations - neither equals %d", combinations, magicNumber);
        }
        
        scan.close();
    }
}
