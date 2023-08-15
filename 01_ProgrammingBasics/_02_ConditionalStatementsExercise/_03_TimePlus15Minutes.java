package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input hours and minutes
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        // Calculate the total time in minutes after adding 15 minutes
        int totalTime = minutes + 15;

        // Adjust hours and remaining minutes if needed
        if (totalTime >= 60) {
            hours = hours + 1;
            totalTime = totalTime % 60;
        }

        // Adjust hours if exceeding 24
        if (hours >= 24) {
            hours = hours % 24;
        }

        // Print the result in the desired format
        if (totalTime < 10) {
            System.out.printf("%d:0%d", hours, totalTime);
        } else {
            System.out.printf("%d:%d", hours, totalTime);
        }
        
        scan.close();
    }
}
