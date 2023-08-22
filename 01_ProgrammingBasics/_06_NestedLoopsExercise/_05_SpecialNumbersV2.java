package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _05_SpecialNumbersV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Print all the special numbers
        for (int i = 1111; i <= 9999; i++) {
            int currentNumber = i;

            int digit1 = currentNumber % 10;
            currentNumber /= 10;
            int digit2 = currentNumber % 10;
            currentNumber /= 10;
            int digit3 = currentNumber % 10;
            int digit4 = currentNumber / 10;

            if (digit1 != 0 && digit2 != 0 && digit3 != 0) {
                if (num % digit1 == 0 && num % digit2 == 0 && num % digit3 == 0 && num % digit4 == 0) {
                    System.out.printf("%d%d%d%d ", digit4, digit3, digit2, digit1);
                }
            }
        }

        scan.close();
    }
}
