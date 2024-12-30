package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input
        double vacationDays = Double.parseDouble(scan.nextLine());
        double workingDays = 365 - vacationDays;

        // Calculate playtime during vacation and working days
        double vacationDaysPlaytime = vacationDays * 127;
        double workingDaysPlaytime = workingDays * 63;

        // Calculate the difference between Tom's total playtime and the required norm
        double playtimeNorm = 30000 - (vacationDaysPlaytime + workingDaysPlaytime);

        // Print the result
        if (playtimeNorm >= 0) {
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(playtimeNorm / 60), playtimeNorm % 60);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(Math.abs(playtimeNorm / 60)), Math.abs(playtimeNorm % 60));
        }

        scan.close();
    }
}
