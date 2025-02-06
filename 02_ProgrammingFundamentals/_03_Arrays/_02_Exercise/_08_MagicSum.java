package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        // Print each pair that the sum of equals the number n
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i+1; j < numbersArray.length; j++) {
                if (numbersArray[i] + numbersArray[j] == n) {
                    System.out.println(numbersArray[i] + " " + numbersArray[j]);
                }
            }
        }

        scan.close();
    }
}
