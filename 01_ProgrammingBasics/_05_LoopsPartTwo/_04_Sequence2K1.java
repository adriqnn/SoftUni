package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _04_Sequence2K1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Staging
        int k = 1;

        // Use a while loop to generate and print the sequence
        while (k <= n) {
            System.out.println(k);

            k = 2 * k + 1;
        }

        scan.close();
    }
}
