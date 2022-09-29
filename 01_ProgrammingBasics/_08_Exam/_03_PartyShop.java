package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _03_PartyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        double price = 0;
        switch(type){
            case "Cake":
                if (days<=15){
                    price = 24.00*count;
                }else{
                    price = 28.70*count;
                }
                break;
            case "Souffle":
                if (days<=15){
                    price = 6.66*count;
                }else{
                    price = 9.80*count;
                }
                break;
            case "Baklava":
                if (days<=15){
                    price = 12.60*count;
                }else{
                    price = 16.98*count;
                }
                break;
        }
        if(days<=22){
            if (price>=100 && price<=200){
                price *= 0.85;
            }else if(price>200){
                price *= 0.75;
            }
        }

        if (days<= 15){
            price *= 0.90;
        }

        System.out.printf("%.2f",price);
    }
}
