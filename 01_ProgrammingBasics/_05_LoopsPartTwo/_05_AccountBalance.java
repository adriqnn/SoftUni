package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _05_AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        double account = 0;

        while(!command.equals("NoMoreMoney")){
            double deposit = Double.parseDouble(command);

            if (deposit <0){
                System.out.println("Invalid operation!");
                break;
            }
            account += deposit;
            System.out.printf("Increase: %.2f%n",deposit);
            command = scan.nextLine();
        }
        System.out.printf("Total: %.2f",account);
    }
}
