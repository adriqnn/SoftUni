package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input values
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double seconds = Double.parseDouble(scan.nextLine());

        // Calculate the time it takes to swim the distance
        double swimDistanceSeconds = distance * seconds;

        // Calculate the resistance time due to each 15 meters
        double resistanceSeconds = Math.floor(distance / 15) * 12.5;

        // Calculate the total time including resistance
        double totalTime = swimDistanceSeconds + resistanceSeconds;

        // Calculate the difference between the new record and the given record
        double timeDifference = Math.abs(totalTime - record);

        // Compare the total time with the given record
        if (totalTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeDifference);
        }
        
        scan.close();
    }
}
