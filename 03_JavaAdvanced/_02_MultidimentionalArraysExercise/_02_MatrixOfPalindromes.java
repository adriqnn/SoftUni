package _03_JavaAdvanced._02_MultidimentionalArraysExercise;

import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] console = scan.nextLine().split("\\s+");
        int n1 = Integer.parseInt(console[0]);
        int n2 = Integer.parseInt(console[1]);
        String[][] matrix = new String[n1][n2];
        char one = 97;
        char two = 97;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String thisLine = "" + one + two + one;
                matrix[i][j] = thisLine;
                two++;
                System.out.print(matrix[i][j] + " ");
            }
            one++;
            two = (char) (97 + i + 1);
            System.out.println();
        }
    }
}
