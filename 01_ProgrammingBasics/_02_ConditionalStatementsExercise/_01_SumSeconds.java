package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _01_SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());

        int totalTime = time1+time2+time3;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds<10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
