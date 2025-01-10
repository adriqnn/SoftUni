package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        int nSum = 0;
        int maxNum = Integer.MIN_VALUE;

        // Read integers and find the maximum
        for (int i = 1; i <= n; i++) {
            // Read new input value
            int num = Integer.parseInt(scan.nextLine());

            if (num > maxNum) {
                maxNum = num;
            }
            
            nSum += num;
        }

        int element = nSum - maxNum;

        // Compare the sums and print the result
        if (element == maxNum) {
            System.out.printf("Yes%nSum = %d%n", maxNum);
        } else {
            System.out.printf("No%nDiff = %d%n", Math.abs(element - maxNum));
        }

        scan.close();
    }
}
