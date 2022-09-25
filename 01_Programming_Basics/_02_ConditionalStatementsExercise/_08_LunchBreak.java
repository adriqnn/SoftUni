package _01_Programming_Basics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _08_LunchBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOfTheSeries = scan.nextLine();
        int episodeLength = Integer.parseInt(scan.nextLine());
        int breakLength = Integer.parseInt(scan.nextLine());

        double lunchTime = breakLength * 1.0/8;
        double breakTime = breakLength * 1.0/4;
        double timeLeft = breakLength - lunchTime - breakTime;

        if(timeLeft >= episodeLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfTheSeries, Math.ceil(timeLeft - episodeLength));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfTheSeries, Math.ceil(episodeLength - timeLeft));
        }
    }
}
