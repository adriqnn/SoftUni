package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        int countAll = 0;
        double m5 = 0;
        double m4 = 0;
        double m3 = 0;
        double m2 = 0;
        double m1 = 0;

        // Calculate the total number of trekkers and the number of trekkers in each group
        for (int i = 1; i <= n; i++) {
            int trekkers = Integer.parseInt(scan.nextLine());
            countAll += trekkers;

            // Distribute trekkers into different groups based on group size
            if (trekkers >= 41) {
                m5 += trekkers;
            } else if (trekkers >= 26) {
                m4 += trekkers;
            } else if (trekkers >= 13) {
                m3 += trekkers;
            } else if (trekkers >= 6) {
                m2 += trekkers;
            } else {
                m1 += trekkers;
            }
        }

        // Calculate and print the percentage distribution of trekkers in each group
        System.out.printf("%.2f%%%n", m1 / countAll * 100);
        System.out.printf("%.2f%%%n", m2 / countAll * 100);
        System.out.printf("%.2f%%%n", m3 / countAll * 100);
        System.out.printf("%.2f%%%n", m4 / countAll * 100);
        System.out.printf("%.2f%%%n", m5 / countAll * 100);

        scan.close();
    }
}
