package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _05_Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        whatIsThePrice(item,quantity);
    }

    private static void whatIsThePrice(String item, double quantity) {
        if (item.equals("coffee")){
            System.out.printf("%.2f",1.50*quantity);
        }else if (item.equals("water")){
            System.out.printf("%.2f",1.00*quantity);
        }else if (item.equals("coke")){
            System.out.printf("%.2f",1.40*quantity);
        }else if (item.equals("snacks")){
            System.out.printf("%.2f",2.00*quantity);
        }
    }
}
