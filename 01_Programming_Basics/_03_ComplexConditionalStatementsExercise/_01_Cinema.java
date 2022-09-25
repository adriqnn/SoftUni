package _01_Programming_Basics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _01_Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        int row = Integer.parseInt(scan.nextLine());
        int number = Integer.parseInt(scan.nextLine());

        double woot = 1.00*row*number;

        switch (type) {
            case "Premiere":
                System.out.printf("%.2f leva", (woot * 12.00));
                break;
            case "Normal":
                System.out.printf("%.2f leva", (woot * 7.50));
                break;
            case "Discount":
                System.out.printf("%.2f leva", (woot * 5.00));
                break;
        }
    }
}
