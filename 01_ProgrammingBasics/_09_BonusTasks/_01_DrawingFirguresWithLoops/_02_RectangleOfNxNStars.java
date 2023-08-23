package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFirguresWithLoops;

import java.util.Scanner;

public class _02_RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print a square nxn of stars
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
