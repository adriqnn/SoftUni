package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

import java.util.Scanner;

public class _05_SquareFrame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int sideLength = scan.nextInt();

        // Print the square frame
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if ((i == 1) && (j == 1 || j == sideLength) || (i == sideLength) && (j == 1 || j == sideLength)) {
                    System.out.print("+ ");
                } else if (j == 1 || j == sideLength ) {
                    System.out.print("| ");
                } else {
                    System.out.print("- ");
                }
            }

            // Move to the next line
            System.out.println();
        }

        scan.close();
    }
}
