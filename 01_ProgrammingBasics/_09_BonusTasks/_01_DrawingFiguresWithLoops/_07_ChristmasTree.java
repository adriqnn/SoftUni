package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

import java.util.Scanner;

public class _07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print the tree
        for (int i = 1; i <= n + 1; i++) {
            printRowOfAFigure(n + 1, i);

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
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == i) {
                System.out.print(" | ");
            } else {
                System.out.print("*");
            }
        }
    }
}

