package _01_Programming_Basics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _05_SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        double coffee = 0;
        double water = 0;
        double beer = 0;
        double sweets = 0;
        double peanuts = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                coffee += quantity * 0.50;
                System.out.println(coffee);
            } else if (product.equals("water")) {
                water += quantity * 0.80;
                System.out.println(water);
            } else if (product.equals("beer")) {
                beer += quantity * 1.20;
                System.out.println(beer);
            } else if (product.equals("sweets")) {
                sweets += quantity * 1.45;
                System.out.println(sweets);
            } else if (product.equals("peanuts")) {
                peanuts += quantity * 1.60;
                System.out.println(peanuts);
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                coffee += quantity * 0.40;
                System.out.println(coffee);
            } else if (product.equals("water")) {
                water += quantity * 0.70;
                System.out.println(water);
            } else if (product.equals("beer")) {
                beer += quantity * 1.15;
                System.out.println(beer);
            } else if (product.equals("sweets")) {
                sweets += quantity * 1.30;
                System.out.println(sweets);
            } else if (product.equals("peanuts")) {
                peanuts += quantity * 1.50;
                System.out.println(peanuts);
            }
        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                coffee += quantity * 0.45;
                System.out.println(coffee);
            } else if (product.equals("water")) {
                water += quantity * 0.70;
                System.out.println(water);
            } else if (product.equals("beer")) {
                beer += quantity * 1.10;
                System.out.println(beer);
            } else if (product.equals("sweets")) {
                sweets += quantity * 1.35;
                System.out.println(sweets);
            } else if (product.equals("peanuts")) {
                peanuts += quantity * 1.55;
                System.out.println(peanuts);
            }
        }
    }
}
