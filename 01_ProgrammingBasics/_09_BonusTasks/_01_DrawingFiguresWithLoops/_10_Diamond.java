package _01_ProgrammingBasics._09_BonusTasks._01_DrawingFiguresWithLoops;

import java.util.Scanner;

public class _10_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        int upper = (int) Math.ceil(n / 2.00);
        int lower = n - upper - (n % 2 == 0 ? 1 : 0);

            // Upper triangle
            for (int i = 1; i <= upper; i++) {
                printTopPart(n, i);
                System.out.println();
            }

            // Lower triangle
            for (int i = lower; i >= 1; i--) {
                printTopPart(n, i);
                System.out.println();
            }

        scan.close();
    }

    public static void printTopPart(int n, int i){
        int stars = n % 2 != 0 ? 1 : 2;

        if (i == 1 || i == n) {
            for (int j = 1; j <= Math.ceil(n / 2.00 - 1); j++) {
                System.out.print("-");
            }

            System.out.print("*".repeat(stars));

            for (int j = 1; j <= Math.ceil(n / 2.00 - 1); j++) {
                System.out.print("-");
            }
        } else {
            int locationRight = ((n / 2) + i);
            
            if (n % 2 != 0) {
                int locationLeft = ((n / 2) + 2 - i);
                
                for (int j = 1; j <= n; j++) {
                    if (j == locationLeft || j == locationRight) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
            } else {
                int locationLeft = ((n / 2) + 1 - i);
                
                for (int j = 1; j <= n; j++) {
                    if (j == locationLeft || j == locationRight) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }
            }
        }
    }
}
