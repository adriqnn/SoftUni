package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _06_WeddingSeats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        char lastSector = scan.nextLine().charAt(0);
        int countOfRowsFirstSector = Integer.parseInt(scan.nextLine());
        int countOfOddSeats = Integer.parseInt(scan.nextLine());

        // Add variables
        int countOfSectors = 0;
        int seatsOdd = (int) 'a' + countOfOddSeats;
        int seatsEven = (int) 'a' + countOfOddSeats + 2;
        int countSeats = 0;

        // Print all possible seats
        for (char i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= countOfRowsFirstSector + countOfSectors; j++) {
                if (j % 2 != 0) {
                    for (char k = 'a'; k < seatsOdd; k++) {
                        countSeats++;
                        System.out.printf("%s%d%s%n", i, j, k);
                    }
                } else {
                    for (char k = 'a'; k < seatsEven; k++) {
                        countSeats++;
                        System.out.printf("%s%d%s%n", i, j, k);
                    }
                }
            }

            countOfSectors++;
        }

        // Print the total count of the seats
        System.out.println(countSeats);

        scan.close();
    }
}
