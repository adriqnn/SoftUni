package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();
        
        // Add variables
        int n = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];
        int[][] matrix = new int[n][n];

        // Fill the matrix based on the given pattern
        if(pattern.equals("A")){
            fillMatrixPatternA(matrix);
        }else if(pattern.equals("B")){
            fillMatrixPatternB(matrix);
        }

        // Print result
        printMatrix(matrix);

        scan.close();
    }

    // Method that fills the matrix in pattern B
    private static void fillMatrixPatternB(int[][] matrix) {
        int n = 1;

        for (int col = 0; col < matrix.length; col++) {
            if(col%2 == 0){
                for (int i = 0; i < matrix[col].length; i++) {
                    matrix[i][col] = n++;
                }
            }else {
                for (int i = matrix[col].length-1; i >= 0; i--) {
                    matrix[i][col] = n++;
                }
            }
        }
    }

    // Method that fills the matrix in pattern A
    private static void fillMatrixPatternA(int[][] matrix) {
        int n = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = n++;
            }
        }
    }

    // Method that prints the matrix
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
