package _01_Programming_Basics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vacation = Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());

        int countSpend = 0;
        int allDays = 0;

        while (money < vacation){
            String action = scan.nextLine();
            double amount = Double.parseDouble(scan.nextLine());
            allDays++;

            if (action.equals("save")){
                countSpend = 0;
                money += amount;
            }
            if(action.equals("spend")){
                countSpend++;
                money -= amount;
                if (money<0){
                    money=0;
                }
            }
            if (countSpend == 5){
                System.out.printf("You can't save the money.\n"
                        + "%d", allDays);
                break;
            }
        }
        if (money >= vacation){
            System.out.printf("You saved the money for %d days.",allDays);
        }
    }
}
