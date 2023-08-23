package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFirguresWithLoops;

import java.util.Scanner;

public class _04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print a triangle of $ signs
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            
            System.out.println();
        }

        scan.close();
    }
}
