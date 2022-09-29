package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _02_Workout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nDays = Integer.parseInt(scan.nextLine());
        double nKilometers = Double.parseDouble(scan.nextLine());

        double distance = nKilometers;
        double allDistance = nKilometers;
        for (int i = 1; i <= nDays; i++) {
            double percentile = Double.parseDouble(scan.nextLine());
            distance = distance + (distance*percentile/100);
            allDistance += distance;
        }
        if (allDistance>=1000){
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(allDistance-1000));
        }else{
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000-allDistance));
        }
    }
}
