package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

import java.util.Scanner;

public class _02_BitAtPositionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int position = 1;

        int binaryNum = num >> position;
        int bitAtPosition = binaryNum & 1;

        System.out.println(bitAtPosition);

        scan.close();
    }
}
