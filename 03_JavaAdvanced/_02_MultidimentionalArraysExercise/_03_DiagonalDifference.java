package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Initialize the matrix
        int [][] matrix = new int[n][n];
        readMatrix(scan, matrix);

        // Add variables and calculate each diagonal's sum
        int sum1 = getSum1(matrix);
        int sum2 = getSum2(matrix);

        //Print result
        System.out.println(Math.abs(sum1 - sum2));

        scan.close();
    }

    // Method the calculates the sum of second diagonal
    private static int getSum1(int[][] matrix) {
        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        
        return sum;
    }

    // Method the calculates the sum of second diagonal
    private static int getSum2(int[][] matrix) {
        int sum = 0;
        int last = matrix.length-1;
        
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[last--][i];
        }
        
        return sum;
    }
    
    // Method that reads the matrix
    private static void readMatrix(Scanner scan, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }
}
