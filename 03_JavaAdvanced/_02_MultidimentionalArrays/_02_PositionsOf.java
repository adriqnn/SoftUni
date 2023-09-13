package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class _02_PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Red input values
        String[] dimensions = scan.nextLine().split("\\s+");

        // Add variables
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];

        // Read matrix
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        boolean notFound = true;
        int number = Integer.parseInt(scan.nextLine());

        // Find the positions of input number
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == number){
                    System.out.println(i + " " + j);
                    notFound = false;
                }
            }
        }

        // Print result
        if(notFound){
            System.out.println("not found");
        }

        scan.close();
    }
}
