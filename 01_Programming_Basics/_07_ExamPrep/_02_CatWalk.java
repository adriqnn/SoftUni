package _01_Programming_Basics._07_ExamPrep;

import java.util.Scanner;

public class _02_CatWalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minutes = Integer.parseInt(scan.nextLine());
        int walks = Integer.parseInt(scan.nextLine());
        int calories = Integer.parseInt(scan.nextLine());

        int minutesAll = minutes*walks;
        int burntCalories = minutesAll*5;

        if(burntCalories >= calories*0.5){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burntCalories);
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burntCalories);
        }
    }
}
