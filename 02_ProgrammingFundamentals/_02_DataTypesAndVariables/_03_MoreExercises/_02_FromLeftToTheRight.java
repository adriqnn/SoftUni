package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Examine left and right numbers
        for (int i = 0; i < n; i++) {
            long[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();

            // Add variables
            long firstNumber = numbersArray[0];
            long secondNumber = numbersArray[1];
            long sum = 0;

            // Compare numbers
            if (firstNumber >= secondNumber) {
                firstNumber = Math.abs(firstNumber);
                
                while (firstNumber > 0) {
                    sum += firstNumber % 10;
                    firstNumber = firstNumber / 10;
                }
            } else {
                secondNumber = Math.abs(secondNumber);
                
                while (secondNumber > 0) {
                    sum += secondNumber % 10;
                    secondNumber = secondNumber / 10;
                }
            }

            // Print result
            System.out.println(sum);
        }

        scan.close();
    }
}
