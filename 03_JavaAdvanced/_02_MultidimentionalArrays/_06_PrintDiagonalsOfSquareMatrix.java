package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(rows,scan,"\\s+");
        int row = 0, col = 0;
        while(row < rows && col < rows){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row++;
            col++;
        }
        System.out.println();
        row = rows - 1;
        col = 0;
        while(row >= 0 && col < rows){
            int current = matrix[row][col];
            System.out.print(current + " ");
            row--;
            col++;
        }
    }
    public static int[][] readMatrix(int rows, Scanner scan, String splitPattern){
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split(splitPattern)).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
