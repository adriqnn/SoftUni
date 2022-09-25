package _01_Programming_Basics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _04_CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double washMachinePrice = Double.parseDouble(scan.nextLine());
        double toyPrice = Double.parseDouble(scan.nextLine());


        int toysCounter = 0;
        double sumMoney = 0;
        double money = 0;
        int count = 0;


        for (int i = 1; i <= age; i++) {
            if (i%2 !=0){
                toysCounter++;
            }else{
                money = money+10;
                sumMoney = sumMoney+money;
                count++;
            }
        }

        double allToysMoney = toyPrice * toysCounter;
        double sum = allToysMoney + sumMoney - count;
        double sum2 = sum-washMachinePrice;

        if (sum>=washMachinePrice){
            System.out.printf("Yes! %.2f", Math.abs(sum2));
        }else{
            System.out.printf("No! %.2f", Math.abs(sum2));
        }
    }
}
