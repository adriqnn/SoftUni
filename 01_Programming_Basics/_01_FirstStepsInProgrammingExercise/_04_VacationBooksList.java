package _01_Programming_Basics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scan.nextLine());
        int pagesReadForAnHour = Integer.parseInt(scan.nextLine());
        int daysOfReading = Integer.parseInt(scan.nextLine());

        int hoursNeededForReading = numberOfPages/pagesReadForAnHour;
        int hoursPerDay = hoursNeededForReading/daysOfReading;

        System.out.println(hoursPerDay);
    }
}
