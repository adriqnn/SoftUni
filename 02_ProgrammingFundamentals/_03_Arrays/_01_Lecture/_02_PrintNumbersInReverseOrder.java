package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Scanner;

public class _02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[] numbers = new int[n];

        for (int i = n-1; i >= 0; i--) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i] = number;
        }
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}
