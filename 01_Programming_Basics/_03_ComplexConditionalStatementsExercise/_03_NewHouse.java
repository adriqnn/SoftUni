package _01_Programming_Basics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _03_NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String types = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        //Roses,Dahlias,Tulips,Narcissus,Gladiolus

        double woot = 0;

        switch (types) {
            case "Roses":
                if (quantity <= 80) {
                    woot += (quantity * 5.00);
                } else {
                    woot += ((quantity * 5.00) * (0.9));
                }
                break;
            case "Dahlias":
                if (quantity <= 90) {
                    woot += (quantity * 3.80);
                } else {
                    woot += ((quantity * 3.80) * (0.85));
                }
                break;
            case "Tulips":
                if (quantity <= 80) {
                    woot += (quantity* 2.80);
                }else {
                    woot += ((quantity* 2.80)*(0.85));
                }
                break;
            case "Narcissus":
                if (quantity < 120) {
                    woot += ((quantity * 3.00) * (1.15));
                } else {
                    woot += (quantity * 3.00);
                }
                break;
            default:
                if (quantity < 80) {
                    woot += ((quantity * 2.50) * (1.2));
                } else {
                    woot += (quantity * 2.50);
                }
                break;
        }

        double yikes = Math.abs(budget - woot);
        double yikes2 = Math.abs(woot-budget);

        boolean isValid2 = (woot !=0);

        if (isValid2) {

            if (budget >= woot) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, types, yikes);
            } else {
                System.out.printf("Not enough money, you need %.2f leva more.", yikes2);
            }
        }
    }
}
