package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _12_TheMatrixV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] dimensions = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        char[][] matrix = new char[rows][];

        // Read and create char array matrix
        for (int i = 0; i < rows; i++) {
            matrix[i] = scan.nextLine().replaceAll(" ", "").toCharArray();
        }

        char fillChar = scan.nextLine().charAt(0);
        String[] startPosition = scan.nextLine().split("\\s+");
        int startRow = Integer.parseInt(startPosition[0]);
        int startCol = Integer.parseInt(startPosition[1]);
        char replaceChar = matrix[startRow][startCol];
        ArrayDeque<String> coordinatesToReplace = new ArrayDeque<>();

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        // Generate the coordinates to replace
        for (int i = 0; i < 4; i++) {
            int newRow = startRow + dx[i];
            int newCol = startCol + dy[i];

            if (isValid(newRow, newCol, rows, cols) && matrix[newRow][newCol] == replaceChar) {
                coordinatesToReplace.offer(newRow + " " + newCol);
            }
        }

        matrix[startRow][startCol] = fillChar;

        // Replace coordinates
        while (!coordinatesToReplace.isEmpty()) {
            String[] coordinates = coordinatesToReplace.poll().split("\\s+");
            int rr = Integer.parseInt(coordinates[0]);
            int cc = Integer.parseInt(coordinates[1]);

            for (int i = 0; i < 4; i++) {
                int newRow = rr + dx[i];
                int newCol = cc + dy[i];

                if (isValid(newRow, newCol, rows, cols) && matrix[newRow][newCol] == replaceChar) {
                    coordinatesToReplace.offer(newRow + " " + newCol);
                }
            }

            matrix[rr][cc] = fillChar;
        }

        // Print result
        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i]);
        }

        scan.close();
    }

    // Method that checks if the given index is valid
    private static boolean isValid(int row, int col, int numRows, int numCols) {
        return row >= 0 && row < numRows && col >= 0 && col < numCols;
    }
}