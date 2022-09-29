package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        String[] valueAt = scan.nextLine().split("\\s+");
        int r = Integer.parseInt(valueAt[0]);
        int c = Integer.parseInt(valueAt[1]);
        ArrayDeque<Integer> newValue = new ArrayDeque<>();
        int n = 0;
        if(r >= 0 && r < matrix.length && c >= 0 && c <matrix[r].length){
            n = matrix[r][c];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int newValueFromFor = 0;
                    if(matrix[i][j] == n){
                        if(indexIsValid(matrix,i-1,j) && matrix[i-1][j] != n){
                            newValueFromFor += matrix[i-1][j];
                        }
                        if(indexIsValid(matrix,i,j-1) && matrix[i][j-1] != n){
                            newValueFromFor += matrix[i][j-1];
                        }
                        if(indexIsValid(matrix,i,j+1) && matrix[i][j+1] != n){
                            newValueFromFor += matrix[i][j+1];
                        }
                        if(indexIsValid(matrix,i+1,j) && matrix[i+1][j] != n){
                            newValueFromFor += matrix[i+1][j];
                        }
                        newValue.offer(newValueFromFor);
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == n){
                    matrix[i][j] = newValue.poll();
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean indexIsValid(int[][] matrix, int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[i].length;
    }
}
