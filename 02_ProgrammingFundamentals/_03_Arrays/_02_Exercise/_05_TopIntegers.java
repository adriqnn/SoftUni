package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _05_TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Add variable
        List<Integer> topIntegers = new ArrayList<>();

        // Determine the top integers
        for (int i = 0; i < numbersArray.length; i++) {
            boolean isBigger = true;

            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] <= numbersArray[j]) {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger) {
                topIntegers.add(numbersArray[i]);
            }
        }

        // Print result
        topIntegers.forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
