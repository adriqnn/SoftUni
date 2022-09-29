package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);
        int [][] matrix = new int[rows][];
        int [][] maxMatrix = new int [3][3];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length-2; j++) {
                int sum = 0;
                sum +=    matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                        + matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if (sum > max){
                    max = sum;
                    int[] yep1 = {matrix[i][j], matrix[i][j+1], matrix[i][j+2]};
                    int[] yep2 = {matrix[i+1][j], matrix[i+1][j+1], matrix[i+1][j+2]};
                    int[] yep3 = {matrix[i+2][j], matrix[i+2][j+1], matrix[i+2][j+2]};
                    maxMatrix[0] =  yep1;
                    maxMatrix[1] = yep2;
                    maxMatrix[2] = yep3;
                }
            }
        }
        System.out.println("Sum = " + max);
        for (int i = 0; i < maxMatrix.length; i++) {
            for (int j = 0; j < maxMatrix[i].length; j++) {
                System.out.print(maxMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
