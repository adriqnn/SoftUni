package _01_Programming_Basics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _05_Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double console = Double.parseDouble(scan.nextLine());
        double console2 = console*100;
        int console3 = (int)console2;
        int count =0;

        while (console3>0){
            if ((console3-200)>=0){
                count++;
                console3-=200;
                continue;
            }
            if ((console3-100)>=0){
                count++;
                console3-=100;
                continue;
            }
            if ((console3-50)>=0){
                count++;
                console3-=50;
                continue;
            }
            if ((console3-20)>=0){
                count++;
                console3-=20;
                continue;
            }
            if ((console3-10)>=0){
                count++;
                console3-=10;
                continue;
            }
            if ((console3-5)>=0){
                count++;
                console3-=5;
                continue;
            }
            if ((console3-2)>=0){
                count++;
                console3-=2;
                continue;
            }
            if (console3==1){
                count++;
                console3-=1;
                break;
            }
        }
        System.out.println(count);
    }
}
