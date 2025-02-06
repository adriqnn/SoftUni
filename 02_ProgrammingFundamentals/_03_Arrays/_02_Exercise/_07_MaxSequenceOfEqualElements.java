package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Add variables
        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        // Determine the longest sequence of equal numbers
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] == numbersArray[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            if (length > maxLength) {
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }

        // Print result
        for (int i = bestStartIndex; i < bestStartIndex+maxLength; i++) {
            System.out.print(numbersArray[i] + " ");
        }

        scan.close();
    }
}
