package _03_JavaAdvanced._02_MultidimentionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _05_MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input values
        int rows = Integer.parseInt(scan.nextLine().split(", ")[0]);
        
        // Read matrix
        int[][] matrix = readMatrix(rows, scan, ", ");
        
        // Add variables
        int max = Integer.MIN_VALUE;
        List<Integer> numbersMax = new ArrayList<>();
        
        // Determine the maximum sum of a sub-matrix
        for (int r = 0; r < matrix.length-1; r++) {
            
            for (int c = 0; c < matrix[r].length-1; c++) {
                int n1 = matrix[r][c];
                int n2 = matrix[r][c+1];
                int n3 = matrix[r+1][c];
                int n4 = matrix[r+1][c+1];
                
                int sum = n1 + n2 + n3 + n4;
                
                if(sum > max){
                    max = sum;
                    List<Integer> numbers = new ArrayList<>();
                    
                    numbers.add(n1); numbers.add(n2); numbers.add(n3); numbers.add(n4);
                    numbersMax = numbers;
                }
            }
        }
        
        // Print result
        System.out.println(numbersMax.get(0) + " " + numbersMax.get(1));
        System.out.println(numbersMax.get(2) + " " + numbersMax.get(3));
        System.out.println(max);

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
