package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

import java.util.Scanner;

public class _01_BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberToCheck = Integer.parseInt(scan.nextLine());
        int binaryDigit = Integer.parseInt(scan.nextLine());

        int count = countBinaryDigits(numberToCheck, binaryDigit);
        System.out.println(count);

        scan.close();
    }

    public static int countBinaryDigits(int number, int binaryDigit) {
        int count = 0;

        while (number > 0) {
            int digit = number % 2;
            if (digit == binaryDigit) {
                count++;
            }
            number /= 2;
        }

        return count;
    }
}
