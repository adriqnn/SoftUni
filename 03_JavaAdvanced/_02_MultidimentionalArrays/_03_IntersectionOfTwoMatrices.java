package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.Scanner;

public class _03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] firstMatrix = readMatrix(rows,cols,scan);
        char[][] secondMatrix = readMatrix(rows,cols,scan);
        char[][] outputMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char fillChar = firstMatrix[row][col] == secondMatrix[row][col]?firstMatrix[row][col]:'*';
                outputMatrix[row][col] = fillChar;
            }
        }
        printMatrix(outputMatrix);
    }
    public static void printMatrix(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printForEach(char[][] matrix){
        for (char[] arr : matrix){
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
    public static char[][] readMatrix(int rows, int cols, Scanner scan){
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = scan.nextLine();
            /*char[] charsArr = line.replaceAll(" ","").toCharArray();
            matrix[i] = charsArr;*/
            String[] elements = line.split("\\s+");
            for (int j = 0; j < elements.length; j++) {
                char current = elements[j].charAt(0);
                matrix[i][j] = current;
            }
        }
        return matrix;
    }
}
