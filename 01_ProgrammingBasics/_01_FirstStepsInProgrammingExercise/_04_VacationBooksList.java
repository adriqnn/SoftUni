package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input data
        int numberOfPages = Integer.parseInt(scan.nextLine());
        int pagesReadPerHour = Integer.parseInt(scan.nextLine());
        int daysOfReading = Integer.parseInt(scan.nextLine());

        // Calculate hours needed for reading
        int hoursNeededForReading = numberOfPages / pagesReadPerHour;

        // Calculate hours of reading per day
        int hoursPerDay = hoursNeededForReading / daysOfReading;

        // Print the hours of reading per day
        System.out.println(hoursPerDay);
        
        scan.close();
    }
}
