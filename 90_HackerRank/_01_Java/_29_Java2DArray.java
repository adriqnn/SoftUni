package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.Scanner;

public class _29_Java2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[6][];
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int biggestNumberSum = Integer.MIN_VALUE;
        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < rows-2; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]
                                       + matrix[i+1][j+1]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                if(sum > biggestNumberSum){
                    biggestNumberSum = sum;
                }
            }
        }

        System.out.println(biggestNumberSum);

        scan.close();
    }
}
