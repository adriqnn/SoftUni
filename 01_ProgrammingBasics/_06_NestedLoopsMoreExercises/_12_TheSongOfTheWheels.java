package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _12_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int controlNumber = Integer.parseInt(scan.nextLine());

        // Add variable
        List<String> combinations = new ArrayList<>();

        // Determine the possible passwords and print them
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int sum = (a * b) + (c * d);
                        if (sum == controlNumber && a < b && c > d) {
                            combinations.add(String.format("%d%d%d%d", a, b, c, d));
                            System.out.printf("%d%d%d%d ", a, b, c, d);
                        }
                    }
                }
            }
        }

        // Print the result
        System.out.println();
        if (combinations.size() >= 4) {
            System.out.printf("Password: %s", combinations.get(3));
        } else {
            System.out.println("No!");
        }

        scan.close();
    }
}
