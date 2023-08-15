package _01_ProgrammingBasics._01_FirstStepsInProgrammingMoreExercies;

import java.util.Scanner;

public class _09_WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the weather type input
        String weatherType = scan.nextLine();

        // Determine and print the appropriate message
        System.out.printf("%s%n", weatherType.equals("sunny") ? "It's warm outside!" : "It's cold outside!");

        scan.close();
    }
}
