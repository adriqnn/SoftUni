package _01_ProgrammingBasics._08_Exam;

import java.util.Scanner;

public class _02_PuppyCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int food = Integer.parseInt(scan.nextLine());
        String console = scan.nextLine();

        int gramsFood = food*1000;
        int gramsTotal = 0;

        while(!console.equals("Adopted")){
            int grams = Integer.parseInt(console);
            gramsTotal += grams;

            console = scan.nextLine();
        }

        if(gramsFood>=gramsTotal){
            System.out.printf("Food is enough! Leftovers: %d grams.", gramsFood-gramsTotal);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.", gramsTotal-gramsFood);
        }
    }
}
