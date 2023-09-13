package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] line = scan.nextLine().split(", ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        // Read the matrix
        int[][] matrix = readMatrix(rows, scan, ", ");

        // Add variable
        int sum = 0;

        // Sum elements of the matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
        }

        // Print result
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

        scan.close();
    }

    // Method that reads the matrix
    public static int[][] readMatrix(int rows, Scanner scan, String splitPattern){
        int[][] matrix = new int[rows][];
        
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        }
        
        return matrix;
    }
}
