package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input values
        String nameOfTheSeries = scan.nextLine();
        int episodeLength = Integer.parseInt(scan.nextLine());
        int breakLength = Integer.parseInt(scan.nextLine());

        // Calculate time allocated for lunch and break
        double lunchTime = breakLength * 1.0 / 8;
        double breakTime = breakLength * 1.0 / 4;
        double timeLeft = breakLength - lunchTime - breakTime;

        // Compare time left with episode length and print the appropriate message
        if (timeLeft >= episodeLength) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfTheSeries, Math.ceil(timeLeft - episodeLength));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfTheSeries, Math.ceil(episodeLength - timeLeft));
        }

        scan.close();
    }
}
