package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _08_TennisRankList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int score = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n; i++) {
            String rank = scan.nextLine().toLowerCase();

            if (rank.equals("w")){
                p1++;
            }else if (rank.equals("f")) {
                p2++;
            }else if (rank.equals("sf")) {
                p3++;
            }
        }

        int pp1 = p1*2000;
        int pp2 = p2*1200;
        int pp3 = p3*720;
        int score2 = score + pp1 + pp2 +pp3;
        double average = ((pp1+pp2+pp3)*1.0)/n;
        double percentile = ((1.0*p1)/n)*100;

        System.out.printf("Final points: %d%n", score2);
        System.out.printf("Average points: %.0f%n", Math.floor(average));
        System.out.printf("%.2f%%",percentile);
    }
}
