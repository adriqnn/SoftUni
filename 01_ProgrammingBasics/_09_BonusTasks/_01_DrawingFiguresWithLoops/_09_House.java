package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

import java.util.Scanner;

public class _09_House {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        int base = n / 2;
        int roof = n - base;

        // Print roof section
        for (int i = 0; i < roof; i++) {
            printRoofLines(n, i);
            System.out.println();
        }

        // Print base section
        for (int i = 0; i < base; i++) {
            printBaseLines(n, i);
            System.out.println();
        }

        scan.close();
    }

    public static void printRoofLines(int n, int i){
        // Add variables
        int stars = n % 2 != 0 ? 1 : 2;
        int numberOfStar =  i == 0 ? stars : stars + (i * 2);

        // Print leading '-'
        for (int j = 1; j <= (n - numberOfStar) / 2; j++) {
            System.out.print("-");
        }

        // Print stars '*'
        for (int j = 1; j <= numberOfStar; j++) {
            System.out.print("*");
        }

        // Print following '-'
        for (int j = 1; j <= (n - numberOfStar) / 2; j++) {
            System.out.print("-");
        }
    }

    public static void printBaseLines(int n, int i){

        // Print lines for the base of the house
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n) {
                System.out.print("|");
            } else {
                System.out.print("*");
            }
        }
    }
}
