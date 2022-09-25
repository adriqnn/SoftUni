package _01_Programming_Basics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double seconds = Double.parseDouble(scan.nextLine());

        double swimDistanceSeconds = distance*seconds;
        double resistanceSeconds = ((Math.floor(distance/15))*12.5);
        double record2 = swimDistanceSeconds+resistanceSeconds;
        double sum = Math.abs(record2-record);

        if (record2<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", record2);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", sum);
        }
    }
}
