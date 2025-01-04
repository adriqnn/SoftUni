package _01_ProgrammingBasics._06_NestedLoops;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());

        // Add variables
        int count = 0;
        boolean isDone = false;

        // Cycle from start to end and search for the magic number
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;

                // Print result if magic number is found
                if (i + j == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, i + j);
                    isDone = true;
                    break;
                }
            }

            if (isDone) {
                break;
            }
        }

        // Print result
        if (!isDone) {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }

        scan.close();
    }
}
