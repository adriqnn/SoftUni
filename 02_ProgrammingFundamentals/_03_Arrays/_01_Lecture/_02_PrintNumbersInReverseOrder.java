package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Scanner;

public class _02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        int[] numbers = new int[n];

        // Reverse the array
        for (int i = n - 1; i >= 0; i--) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i] = number;
        }
        
        // Print result
        for (int num: numbers) {
            System.out.print(num + " ");
        }
        
        scan.close();
    }
}
