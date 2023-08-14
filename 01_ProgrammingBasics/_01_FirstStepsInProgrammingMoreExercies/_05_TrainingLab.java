package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _05_TrainingLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input dimensions
        double lengthOfTheRoom = Double.parseDouble(scan.nextLine());
        double widthOfTheRoom = Double.parseDouble(scan.nextLine());

        // Calculate the number of desks per row and number of rows
        long numberOfDesksPerRow = Math.round(lengthOfTheRoom * 100) / 120;
        long numberOfRows = Math.round((widthOfTheRoom * 100) - 100) / 70;

        // Calculate the total number of seats
        long numberOfSeats = (numberOfDesksPerRow * numberOfRows) - 3;

        // Print the total number of seats
        System.out.println(numberOfSeats);

        scan.close();
    }
}
