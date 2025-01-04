package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _05_ChallengeTheWeddingV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int clientsM = Integer.parseInt(scan.nextLine());
        int clientsF = Integer.parseInt(scan.nextLine());
        int maxTables = Integer.parseInt(scan.nextLine());

        // Arrange guest based on gender and free tables
        outerLoop:
        for (int i = 1; i <= clientsM; i++) {
            for (int j = 1; j <= clientsF; j++) {
                if (maxTables == 0) {
                    break outerLoop;
                }
                
                maxTables--;
                System.out.printf("(%d <-> %d) ", i, j);
            }
        }

        scan.close();
    }
}
