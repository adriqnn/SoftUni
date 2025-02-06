package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());
        int[] numbersArrayOne = new int[n];
        int[] numbersArrayTwo = new int[n];

        // Gather arrays in the selected pattern from the input values
        for (int i = 0; i < n; i++) {
            int[] line = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0 ) {
                numbersArrayOne[i] = line[0];
                numbersArrayTwo[i] = line[1];
            } else {
                numbersArrayOne[i] = line[1];
                numbersArrayTwo[i] = line[0];
            }
        }

        // Print result
        Arrays.stream(numbersArrayOne).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(numbersArrayTwo).forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
