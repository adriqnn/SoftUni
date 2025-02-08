package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Create method that determines the top numbers
        topNUmber(n);

        scan.close();
    }

    private static void topNUmber(int n) {
        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            boolean hasOdd = false;

            while (number != 0) {
                if (number % 2 != 0) {
                    hasOdd = true;
                }

                sum += number % 10;
                number /= 10;
            }

            if (sum % 8 == 0 && hasOdd) {
                System.out.println(i);
            }
        }
    }
}
