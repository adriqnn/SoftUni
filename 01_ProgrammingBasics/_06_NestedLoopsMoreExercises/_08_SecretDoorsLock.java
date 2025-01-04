package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _08_SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int hundredsLimit = Integer.parseInt(scan.nextLine());
        int tensLimit = Integer.parseInt(scan.nextLine());
        int unitsLimit = Integer.parseInt(scan.nextLine());

        // Print all the possible combination within the limitations
        for (int i = 2; i <= hundredsLimit; i += 2) {
            for (int j = 1; j <= tensLimit; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= unitsLimit; k += 2) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
        
        scan.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
