package _01_Programming_Basics._04_LoopsPartOne;

import java.util.Scanner;

public class _04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int power = 1;

        for (int i = 0; i <= n; i++){
            if(i == 0){
                System.out.println(1);
            }else if (i%2 == 0){
                System.out.println(power);
            }
            power=power*2;
        }
    }
}
