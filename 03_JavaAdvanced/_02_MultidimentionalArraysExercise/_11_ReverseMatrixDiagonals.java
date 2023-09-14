package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] dimensions = scan.nextLine().split("\\s+");

        // Add variables
        int row = Integer.parseInt(dimensions[0]);
        int col = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[row][];

        // Read and create the matrix
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int n = matrix[row-1].length-1;
        int secondIndex = col-1;

        // Print right diagonal
        for (int i = matrix[row-1].length-1; i >= 0; i--) {
            int firstIndex = matrix.length-1;

            for (int j = n; j <= matrix[row-1].length-1; j++) {
                if(indexIsValid(firstIndex,secondIndex,matrix)) {
                    System.out.print(matrix[firstIndex--][secondIndex++] + " ");
                }else{
                    firstIndex--;
                    secondIndex++;
                }
            }

            n--;
            secondIndex = n;

            System.out.println();
        }

        int m = row-2;
        int indexOne = row-2;

        // Print left diagonal
        for (int i = m; i >= 0; i--) {
            int indexTwo = 0;

            for (int j = 0; j < i+1; j++) {
                if(indexIsValid(indexOne,indexTwo,matrix)) {
                    System.out.print(matrix[indexOne--][indexTwo++] + " ");
                }else{
                    indexOne--;
                    indexTwo++;
                }
            }

            m--;
            indexOne = m;

            System.out.println();
        }

        scan.close();
    }

    // Method that checks if the index is valid
    private static boolean indexIsValid(int h, int m, int[][] matrix) {
        return h >= 0 && h < matrix.length && m >= 0 && m < matrix[h].length;
    }
}
