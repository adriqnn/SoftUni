package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

import java.util.Scanner;

public class _08_Sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print the sunglasses
        for (int i = 1; i <= n; i++) {
            printFrame(n * 2, i);
            printLink(n, i);
            printFrame(n * 2, i);

            System.out.println();
        }

        scan.close();
    }

    // Print sides
    public static void printFrame(int n, int i){
        for (int j = 1; j <= n; j++) {
            if (j == 1 || i == 1 || j == n || i == n / 2) {
                System.out.print("*");
            } else {
                System.out.print("/");
            }
        }
    }

    // Print middle
    public static void printLink(int n, int i){
        for (int j = 1; j <= n; j++) {
            double mid = Math.ceil((n * 1.00) / 2);
            
            if (i == mid) {
                System.out.print("|");
            } else {
                System.out.print(" ");
            }
        }
    }
}
