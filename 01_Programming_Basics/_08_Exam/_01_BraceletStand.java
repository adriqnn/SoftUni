package _01_Programming_Basics._08_Exam;

import java.util.Scanner;

public class _01_BraceletStand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        double profit = Double.parseDouble(scan.nextLine());
        double expenses = Double.parseDouble(scan.nextLine());
        double gift = Double.parseDouble(scan.nextLine());

        double money2 = 5*money;
        double profit2 = 5*profit;
        double saved = money2+profit2;
        double expenses2 = saved-expenses;

        if(gift<=expenses2){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",expenses2);
        }else{
            System.out.printf("Insufficient money: %.2f BGN.",Math.abs(expenses2-gift));
        }
    }
}
