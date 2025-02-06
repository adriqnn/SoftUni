package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] numberOneArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] numberTwoArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Add variables
        int sum = 0;
        boolean isEqual = true;

        // Compare each element of the arrays
        for (int i = 0; i < numberOneArray.length; i++) {
            if (numberOneArray[i] == numberTwoArray[i]) {
                sum += numberOneArray[i];
            } else {
                isEqual = false;
                sum = i;
                break;
            }
        }

        // Print result
        if (isEqual) {
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            System.out.println("Arrays are not identical. Found difference at " + sum + " index.");
        }

        scan.close();
    }
}
