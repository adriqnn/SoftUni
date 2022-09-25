package _01_Programming_Basics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double money = Double.parseDouble(scan.nextLine());

        boolean isValid = (city.equals("Sofia") || city.equals("Varna") || city.equals("Plovdiv"));
        boolean isValid2 = (money >=0 );

        if (!isValid || !isValid2){
            System.out.println("error");
        }

        double result = 0;

        if (city.equals("Sofia")){
            if ( money > 10000 ){
                result = money*0.12;
            }else if (10000 >= money && money >1000){
                result = money*0.08;
            }else if ( 1000 >= money && money > 500){
                result = money*0.07;
            }else if (500 >= money && money >0){
                result = money*0.05;
            }else if (money == 0){
                result = money*0.05;
            }
        }else if (city.equals("Varna")){
            if ( money > 10000 ){
                result = money*0.13;
            }else if (10000 >= money && money >1000){
                result = money*0.10;
            }else if ( 1000 >= money && money > 500){
                result = money*0.075;
            }else if (500 >= money && money >0){
                result = money*0.045;
            }else if (money == 0){
                result = money*0.045;
            }
        }else if (city.equals("Plovdiv")){
            if ( money > 10000 ){
                result = money*0.145;
            }else if (10000 >= money && money >1000){
                result = money*0.12;
            }else if ( 1000 >= money && money > 500){
                result = money*0.08;
            }else if (500 >= money && money >0){
                result = money*0.055;
            }else if (money == 0){
                result = money*0.055;
            }
        }
        if (result>0){
            System.out.printf("%.2f", result);
        }
    }
}
