package _01_ProgrammingBasics._06_NestedLoopsMoreExercises;

import java.util.Scanner;

public class _06_WeddingSeatsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        char lastSector = scan.nextLine().charAt(0);
        int currentCountOfRows = Integer.parseInt(scan.nextLine());
        int countOfOddSeats = Integer.parseInt(scan.nextLine());

        // Add variable
        int countSeats = 0;

        // Print all possible seats
        for (char sector = 'A'; sector <= lastSector; sector++) {
            for (int row = 1; row <= currentCountOfRows; row++) {
                char startSeat = 'a';
                char endSeat = (row % 2 != 0) ? (char) (startSeat + countOfOddSeats) :  (char) (startSeat + countOfOddSeats + 2);

                for (char seat = startSeat; seat < endSeat; seat++) {
                    countSeats++;
                    System.out.printf("%s%d%s%n", sector, row, seat);
                }
            }

            currentCountOfRows++;
        }

        // Print the total count of the seats
        System.out.println(countSeats);

        scan.close();
    }
}
