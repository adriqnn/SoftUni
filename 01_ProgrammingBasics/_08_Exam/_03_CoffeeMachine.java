package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String type = scan.nextLine();
        String sugar = scan.nextLine();
        int amount = Integer.parseInt(scan.nextLine());

        // Add variable
        double price = 0;

        // Determine the price based on the order
        switch (type) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = amount * 0.9 * 0.65;
                    
                    if (amount >= 5) {
                        price *= 0.75;
                    }
                } else if (sugar.equals("Normal")) {
                    price = amount * 1.00;
                    
                    if (amount >= 5) {
                        price *= 0.75;
                    }
                } else if (sugar.equals("Extra")) {
                    price = amount * 1.20;
                    
                    if (amount >= 5) {
                        price *= 0.75;
                    }
                }
                
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = amount * 1.00 * 0.65;
                } else if (sugar.equals("Normal")) {
                    price = amount * 1.20;
                } else if (sugar.equals("Extra")) {
                    price = amount * 1.60;
                }

                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = amount * 0.5 * 0.65;
                } else if (sugar.equals("Normal")) {
                    price = amount * 0.60;
                } else if (sugar.equals("Extra")) {
                    price =  amount * 0.70;
                }
                
                break;
        }

        // Print result
        if (price > 15) {
            System.out.printf("You bought %d cups of %s for %.2f lv.", amount, type, price * 0.8);
        } else {
            System.out.printf("You bought %d cups of %s for %.2f lv.", amount, type, price);
        }
        
        scan.close();
    }
}
