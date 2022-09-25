package _01_Programming_Basics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int countAll = 0;
        double m5 =0;
        double m4 =0;
        double m3 =0;
        double m2 =0;
        double m1 =0;
        for (int i = 1; i <= n; i++) {
            int console = Integer.parseInt(scan.nextLine());
            countAll += console;
            if(console>= 41){
                m5 += console;
            }else if(console>=26){
                m4+=console;
            }else if(console>=13){
                m3+=console;
            }else if (console>=6){
                m2+=console;
            }else {
                m1+=console;
            }

        }
        System.out.printf("%.2f%%%n",m1/countAll*100);
        System.out.printf("%.2f%%%n",m2/countAll*100);
        System.out.printf("%.2f%%%n",m3/countAll*100);
        System.out.printf("%.2f%%%n",m4/countAll*100);
        System.out.printf("%.2f%%%n",m5/countAll*100);
    }
}
