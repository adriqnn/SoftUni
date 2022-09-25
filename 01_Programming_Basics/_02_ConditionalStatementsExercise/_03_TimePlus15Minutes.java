package _01_Programming_Basics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int time = minutes+15;

       if (time >= 60) {
            hours = hours + 1;
            time = time % 60;
       }

       if (hours >= 24){
            hours = 0;
       }

       if (time < 10) {
           System.out.printf("%d:0%d", hours, time);
       } else {
           System.out.printf("%d:%d", hours, time);
       }
    }
}
