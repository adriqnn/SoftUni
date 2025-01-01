package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _08_NumberSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Stage the default
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        // Find the max and min numbers in the n sequence
        for ( int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scan.nextLine());
            
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
            
            if (currentNum < minNum) {
                minNum = currentNum;
            }
        }

        // Print the max and the min numbers
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);

        scan.close();
    }
}
