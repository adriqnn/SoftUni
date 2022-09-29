package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        boolean isValid1 = (fruit.equals("banana") || fruit.equals("apple") ||fruit.equals("orange") ||fruit.equals("grapefruit") ||fruit.equals("kiwi") ||fruit.equals("pineapple") ||fruit.equals("grapes"));
        boolean isValid2 = (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday") || day.equals("Sunday"));

        if (!isValid1 || !isValid2){ System.out.println("error"); }

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")){
                System.out.printf("%.2f",(quantity*2.50));
            }else if (fruit.equals("apple")) {
                System.out.printf("%.2f",(quantity*1.20));
            }else if (fruit.equals("orange")) {
                System.out.printf("%.2f",(quantity*0.85));
            }else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f",(quantity*1.45));
            }else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f",(quantity*2.70));
            }else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f",(quantity*5.50));
            }else if (fruit.equals("grapes")) {
                System.out.printf("%.2f",(quantity*3.85));
            }
        }else if (day.equals("Saturday") || day.equals("Sunday")){
            if (fruit.equals("banana")){
                System.out.printf("%.2f",(quantity*2.70));
            }else if (fruit.equals("apple")) {
                System.out.printf("%.2f",(quantity*1.25));
            }else if (fruit.equals("orange")) {
                System.out.printf("%.2f",(quantity*0.90));
            }else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f",(quantity*1.60));
            }else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f",(quantity*3.00));
            }else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f",(quantity*5.60));
            }else if (fruit.equals("grapes")) {
                System.out.printf("%.2f",(quantity*4.20));
            }
        }
    }
}
