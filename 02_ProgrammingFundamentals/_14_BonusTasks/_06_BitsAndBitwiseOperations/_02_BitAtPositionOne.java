package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

import java.util.Scanner;

public class _02_BitAtPositionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int position = 1;

        int bitAtPosition = bitAtPosition(number, position);
        System.out.println(bitAtPosition);

        scan.close();
    }

    public static int bitAtPosition(int number, int position) {
        int binaryNum = number >> position;
        return binaryNum & 1;
    }
}
