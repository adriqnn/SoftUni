package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _01_SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input times
        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());

        // Calculate the total time in seconds
        int totalTime = timeFirst + timeSecond + timeThird;

        // Convert the total time to minutes and seconds
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        // Print the result in the desired format
        String timeResult = seconds < 10 ? String.format("%d:0%d", minutes, seconds) : String.format("%d:%d", minutes, seconds);
        System.out.println(timeResult);
        
        scan.close();
    }
}
