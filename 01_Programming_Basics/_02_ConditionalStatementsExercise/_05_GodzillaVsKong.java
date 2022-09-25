package _01_Programming_Basics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int extras = Integer.parseInt(scan.nextLine());
        double clothes = Double.parseDouble(scan.nextLine());

        double setting = (budget*0.1);
        double clothes2 = 0;


        if (extras>150){ clothes2 += ((clothes*extras)*0.9); }
        else { clothes2 += (clothes*extras); }

        double sum = budget - (clothes2+setting);

        if (sum >= 0) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", sum); }
        else if ( sum < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(sum)); }
    }
}
