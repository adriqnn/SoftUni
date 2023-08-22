package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _02_LettersCombinationsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char skipLetter = scan.nextLine().charAt(0);

        // Add variable
        int count = 0;

        // Find all the combinations and print them
        for (char i = first; i <= second; i++) {
            for (char j = first; j <= second; j++) {
                for (char k = first; k <= second; k++) {
                    if (i != skipLetter && j != skipLetter && k != skipLetter) {
                        count++;
                        System.out.printf("%s%s%s ", i, j, k);
                    }
                }
            }
        }

        // Print the count of the combinations
        System.out.print(count);

        scan.close();
    }
}
