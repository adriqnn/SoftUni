package _01_ProgrammingBasics._06_NestedLoops;

import java.util.Scanner;

public class _06_Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        // Print last floor large apartments
        for (int i = floors; i > floors - 1; i = floors - 1) {
            for (int j = 0; j < rooms; j++) {
                System.out.printf("L%d%d ", i, j);
            }
        }

        // Cycle through the rest of the building
        for (int i = floors - 1; i >= 1; i--) {
            // New line
            System.out.printf("%n");

            // Print apartments
            if (i % 2 != 0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("A%d%d ", i, j);
                }
            }

            // Print offices
            if (i % 2 == 0) {
                for (int j = 0; j < rooms; j++) {
                    System.out.printf("O%d%d ", i, j);
                }
            }
        }

        scan.close();
    }
}
