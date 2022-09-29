package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = fillMatrix(scan,8);
        ArrayDeque<String> queens = getQueenIndexes(matrix);
        String theRealQueen = revealTheRealQueen(matrix,queens);
        System.out.println(theRealQueen.charAt(0) + " " + theRealQueen.charAt(1));

    }

    private static String revealTheRealQueen(char[][] matrix, ArrayDeque<String> queens) {
        int length = queens.size();
        String realQueen = "";
        for (int i = 0; i < length; i++) {
            String coordinates = queens.poll();
            int c1 = Character.getNumericValue(coordinates.charAt(0));
            int c2 = Character.getNumericValue(coordinates.charAt(1));
            boolean isItTheRealQueen = isItReal(matrix,c1,c2);
            if (isItTheRealQueen){
                realQueen = coordinates;
            }
        }
        return realQueen;
    }

    private static boolean isItReal(char[][] matrix, int row, int col) {
        //row/column/diagonal1/diagonal2
        for (int r = 0; r < matrix.length; r++) {
            if(r == row){
                continue;
            }
            if (matrix[r][col] == 'q'){
                return false;
            }
        }
        for (int c = 0; c < matrix.length; c++) {
            if (c == col){
                continue;
            }
            if(matrix[row][c] == 'q'){
                return false;
            }
        }
        int uldElement = col - 1;
        for (int i = row - 1; i >= 0 && uldElement >= 0; i--, uldElement--) { // UpLeftDiagonal yes
            char charToCheck = matrix[i][uldElement];
            if (charToCheck == 'q') {
                return false;
            }
        }
        int urdElement = col + 1;
        for (int i = row - 1; i >= 0 && urdElement < matrix[i].length; i--, urdElement++) { // UpRightDiagonal yes
            char charToCheck = matrix[i][urdElement];
            if (charToCheck == 'q') {
                return false;
            }
        }
        int element = col - 1;
        for (int i = row + 1; i < matrix.length && element >= 0; i++, element--) { // DownLeftDiagonal
            char charToCheck = matrix[i][element];
            if (charToCheck == 'q') {
                return false;
            }
        }
        int element1 = col + 1;
        for (int i = row + 1; i < matrix.length && element1 < matrix[row].length; i++, element1++) { // DownRightDiagonal
            char charToCheck = matrix[i][element1];
            if (charToCheck == 'q') {
                return false;
            }
        }
        return true;
    }
    private static ArrayDeque<String> getQueenIndexes(char[][] matrix) {
        ArrayDeque<String> queens = new ArrayDeque<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 'q'){
                    queens.offer(String.valueOf(i) + String.valueOf(j));
                }
            }
        }
        return queens;
    }
    private static char[][] fillMatrix(Scanner scan, int i) {
        char[][] matrix = new char[8][8];
        for (int j = 0; j < matrix.length; j++) {
            String line = scan.nextLine();
            char[] charsArr = line.replaceAll(" ","").toCharArray();
            matrix[j] = charsArr;
        }
        return matrix;
    }
}
