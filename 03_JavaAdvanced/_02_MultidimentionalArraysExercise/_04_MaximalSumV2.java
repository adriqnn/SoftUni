package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_MaximalSumV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] inputLine = scan.nextLine().split("\\s+");

        // Add variables
        int rows = Integer.parseInt(inputLine[0]);

        int [][] matrix = new int[rows][];
        int [][] maxMatrix = new int [3][3];

        // Read the matrix
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int maxSum = Integer.MIN_VALUE;

        // Determine the matrix with max sum value
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                int currentSum = 0;

                currentSum +=    matrix[i][j]   + matrix[i][j+1]   + matrix[i][j+2]
                        + matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    for (int row = 0; row < 3; row++) {
                        for (int col = 0; col < 3; col++) {
                            maxMatrix[row][col] = matrix[i + row][j + col];
                        }
                    }
                }
            }
        }

        // Print result
        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < maxMatrix.length; i++) {
            for (int j = 0; j < maxMatrix[i].length; j++) {
                System.out.print(maxMatrix[i][j] + " ");
            }

            System.out.println();
        }

        scan.close();
    }
}
