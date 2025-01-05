package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

import java.util.Scanner;

public class _06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = scan.nextInt();

        // Upper triangle
        for (int i = 1; i <= n; i++) {
            // Print upper triangle lines
            printRowOfAFigure(n, i);

            // Move to the next line
            System.out.println();
        }

        // Lower triangle
        for (int i = n - 1 ; i >= 1; i--) {
            // Print lower triangle lines
            printRowOfAFigure(n, i);

            // Move to the next line
            System.out.println();
        }

        scan.close();
    }

    public static void printRowOfAFigure(int n, int i){
        // Print spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        // Print stars in each row
        for (int k = 1; k <= 2 * i - k; k++) {
            if (k == 1) {
                System.out.print("*");
            } else {
                System.out.print(" *");
            }
        }
    }
}
