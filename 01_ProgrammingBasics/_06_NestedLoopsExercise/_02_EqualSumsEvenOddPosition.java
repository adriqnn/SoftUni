package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        // Print number in between the numbers above based on the requirement
        for (int i = num1; i <= num2; i++) {
            String current = "" + i;

            int even = 0;
            int odd = 0;

            for (int j = 0; j < current.length(); j++) {
                int currentDigit = Integer.parseInt("" + current.charAt(j));

                // Check if the current index is even or odd
                if (j % 2 == 0) {
                    even += currentDigit;
                }
                
                if (j % 2 != 0) {
                    odd += currentDigit;
                }
            }

            // If the sums of even and odd-positioned digits are equal, print the number
            if (even == odd) {
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}
