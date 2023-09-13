package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] console = scan.nextLine().split("\\s+");

        // Add variables
        int matrixRows = Integer.parseInt(console[0]);
        int matrixCols = Integer.parseInt(console[1]);
        String[][] matrix = new String[matrixRows][matrixCols];
        char palindromeCharacter = 97;
        char middleCharacter = 97;

        // Print a matrix of character palindromes
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                String characterPalindrome = "" + palindromeCharacter + middleCharacter + palindromeCharacter;

                matrix[i][j] = characterPalindrome;
                middleCharacter++;

                System.out.print(matrix[i][j] + " ");
            }
            
            palindromeCharacter++;
            middleCharacter = (char) (97 + i + 1);
            
            System.out.println();
        }

        scan.close();
    }
}
