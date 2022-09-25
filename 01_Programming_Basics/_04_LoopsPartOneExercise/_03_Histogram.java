package _01_Programming_Basics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _03_Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {

            int num = Integer.parseInt(scan.nextLine());

            if (num<200){
                p1++;
            }else if (num<400){
                p2++;
            }else if (num<600){
                p3++;
            }else if (num<800) {
                p4++;
            }else{
                p5++;
            }
        }
        double pp1 = ((1.00*p1)/n)*100;
        double pp2 = ((1.00*p2)/n)*100;
        double pp3 = ((1.00*p3)/n)*100;
        double pp4 = ((1.00*p4)/n)*100;
        double pp5 = ((1.00*p5)/n)*100;

        System.out.printf("%.2f%%%n",pp1);
        System.out.printf("%.2f%%%n",pp2);
        System.out.printf("%.2f%%%n",pp3);
        System.out.printf("%.2f%%%n",pp4);
        System.out.printf("%.2f%%%n",pp5);
    }
}
