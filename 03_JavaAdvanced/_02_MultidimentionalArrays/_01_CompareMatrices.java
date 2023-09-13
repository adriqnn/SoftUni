package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int rows = Integer.parseInt(scan.nextLine().split("\\s+")[0]);
        int[][] firstMatrix = readingMatrix(rows, scan);

        // Read input values
        rows = Integer.parseInt(scan.nextLine().split("\\s+")[0]);
        int[][] secondMatrix = readingMatrix(rows, scan);

        // Add variables
        boolean areEqual = areEqual(firstMatrix,secondMatrix);
        String output = areEqual ? "equal" : "not equal";

        // Print result
        System.out.println(output);

        scan.close();
    }

    // Method that determines if inputs are equal
    private static boolean areEqual(int[][] firstMatrix,int[][] secondMatrix){
        if(firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if(firstArr.length != secondArr.length){
                return false;
            }

            for (int index = 0; index < firstArr.length; index++) {
                if(firstArr[index] != secondArr[index]){
                    return false;
                }
            }
        }

        return true;
    }

    // Method that read the matrix
    public static int[][] readingMatrix(int rows, Scanner scan){
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}
