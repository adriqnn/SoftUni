package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPens = Integer.parseInt(scan.nextLine());
        int numberOfSharpies = Integer.parseInt(scan.nextLine());
        int litersOfCleaningSupplies = Integer.parseInt(scan.nextLine());
        int discountPercentage = Integer.parseInt(scan.nextLine());

        double pensPrice = numberOfPens * 5.80;
        double sharpiesPrice = numberOfSharpies * 7.20;
        double cleaningSuppliesPrice = litersOfCleaningSupplies * 1.20;
        double totalPrice = (pensPrice + sharpiesPrice + cleaningSuppliesPrice) * ((100-discountPercentage) * 1.0/100);

        System.out.println(totalPrice);
    }
}
