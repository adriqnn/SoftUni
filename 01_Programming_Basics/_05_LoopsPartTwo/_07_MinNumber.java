package _01_Programming_Basics._05_LoopsPartTwo;

import java.util.Scanner;

public class _07_MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int num = Integer.MAX_VALUE;

        while(!command.equals("Stop")){
            int number = Integer.parseInt(command);
            if (number<num){
                num=number;
            }
            command = scan.nextLine();
        }
        System.out.println(num);
    }
}
