package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_TheLiftV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int numberOfPeopleWaiting = Integer.parseInt(scan.nextLine());
        int[] liftSeatsPosition = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Add variables
        int remainingPeopleInQueue = numberOfPeopleWaiting;
        int availableSeatsLeft = 0;

        // Fill in the empty seats
        for (int i = 0; i < liftSeatsPosition.length; i++) {
            if (liftSeatsPosition[i] < 4) {
                int availableSeats = 4 - liftSeatsPosition[i];
                
                if (remainingPeopleInQueue >= availableSeats) {
                    remainingPeopleInQueue -= availableSeats;
                    liftSeatsPosition[i] = 4;
                } else {
                    liftSeatsPosition[i] = liftSeatsPosition[i] + remainingPeopleInQueue;
                    availableSeatsLeft += availableSeats - remainingPeopleInQueue;
                    remainingPeopleInQueue = 0;
                }
            }
        }

        // Print result 1.
        if (availableSeatsLeft > 0) {
            System.out.printf("The lift has empty spots!%n");
        } else if (remainingPeopleInQueue > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", remainingPeopleInQueue);
        }

        // Print result 2.
        System.out.println(Arrays.stream(liftSeatsPosition).mapToObj(String::valueOf).collect(Collectors.joining(" ")));

        scan.close();
    }
}
