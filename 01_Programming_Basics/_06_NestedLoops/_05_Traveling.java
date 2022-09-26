package _01_Programming_Basics._06_NestedLoops;

import java.util.Scanner;

public class _05_Traveling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        String where = "";

        while(!console.equals("End")){
            String destination = console;
            double budget = Double.parseDouble(scan.nextLine());
            double sum = 0;
            where = destination;
            while(sum<budget){
                double amount = Double.parseDouble(scan.nextLine());
                sum+=amount;
            }
            System.out.printf("Going to %s!%n", where);

            console = scan.nextLine();
        }
    }
}
