package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _09_FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        double volumeInLiters = length * width * height / 1000.0;
        double multiplier = (100 - percentage) / 100;
        double litersOfWater = volumeInLiters * multiplier;

        System.out.println(litersOfWater);
    }
}
