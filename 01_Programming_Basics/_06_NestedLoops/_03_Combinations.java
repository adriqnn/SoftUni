package _01_Programming_Basics._06_NestedLoops;

import java.util.Scanner;

public class _03_Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int count = 0;

        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j <= num ; j++) {
                for (int k = 0; k <=num ; k++) {
                    if(i+j+k == num){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
