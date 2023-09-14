package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _12_TheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] dimensions = scan.nextLine().split("\\s+");

        // Add variables
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        char[][] matrix = new char[rows][];

        // Read and create char array matrix
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scan.nextLine().replaceAll(" ", "").toCharArray();
        }

        char fillChar = scan.nextLine().charAt(0);
        String[] startPosition = scan.nextLine().split("\\s+");

        int startRow = Integer.parseInt(startPosition[0]);
        int startCol = Integer.parseInt(startPosition[1]);
        char replaceChar = matrix[startRow][startCol];
        ArrayDeque<String> coordinatesToReplace = new ArrayDeque<>();

        // Generate the coordinates to replace
        for (int i = 0; i < 4; i++) {
            if(isValid(startRow-1,startCol,matrix)) {
                if (matrix[startRow - 1][startCol] == replaceChar) {
                    int up = startRow - 1;
                    coordinatesToReplace.offer(up + " " + startCol);
                }
            }

            if(isValid(startRow+1,startCol,matrix)) {
                if (matrix[startRow + 1][startCol] == replaceChar) {
                    int down = startRow + 1;
                    coordinatesToReplace.offer(down + " " + startCol);
                }
            }

            if(isValid(startRow,startCol-1,matrix)) {
                if (matrix[startRow][startCol - 1] == replaceChar) {
                    int left = startCol - 1;
                    coordinatesToReplace.offer(startRow + " " + left);
                }
            }

            if(isValid(startRow,startCol+1,matrix)) {
                if (matrix[startRow][startCol + 1] == replaceChar) {
                    int right = startCol + 1;
                    coordinatesToReplace.offer(startRow + " " + right);
                }
            }

            matrix[startRow][startCol] = fillChar;
        }

        // Replace coordinates
        while(!coordinatesToReplace.isEmpty()){
            String[] coordinates = coordinatesToReplace.poll().split("\\s+");

            int rr = Integer.parseInt(coordinates[0]);
            int cc = Integer.parseInt(coordinates[1]);

            if(isValid(rr-1,cc,matrix)) {
                if (matrix[rr - 1][cc] == replaceChar) {
                    int up = rr - 1;
                    String upQ = up + " " + cc;

                    if(!coordinatesToReplace.contains(upQ)){
                        coordinatesToReplace.offer(upQ);
                    }
                }
            }

            if(isValid(rr+1,cc,matrix)) {
                if (matrix[rr + 1][cc] == replaceChar) {
                    int down = rr + 1;
                    String downQ = down + " " + cc;

                    if(!coordinatesToReplace.contains(downQ)){
                        coordinatesToReplace.offer(downQ);
                    }
                }
            }

            if(isValid(rr,cc-1,matrix)) {
                if (matrix[rr][cc - 1] == replaceChar) {
                    int left = cc - 1;
                    String leftQ = rr + " " + left;

                    if(!coordinatesToReplace.contains(leftQ)){
                        coordinatesToReplace.offer(leftQ);
                    }
                }
            }

            if(isValid(rr,cc+1,matrix)) {
                if (matrix[rr][cc + 1] == replaceChar) {
                    int right = cc +1;
                    String rightQ = rr + " " + right;

                    if(!coordinatesToReplace.contains(rightQ)){
                        coordinatesToReplace.offer(rightQ);
                    }
                }
            }

            matrix[rr][cc] = fillChar;
        }

        // Print result
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }

            System.out.println();
        }

        scan.close();
    }

    // Method that checks if the given index is valid
    private static boolean isValid(int startRow, int startCol, char[][] matrix) {
        return startRow >= 0 && startRow < matrix.length && startCol >= 0 && startCol < matrix[startRow].length;
    }
}
