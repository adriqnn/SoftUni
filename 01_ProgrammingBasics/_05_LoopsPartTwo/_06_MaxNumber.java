package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _06_MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        int num = Integer.MIN_VALUE;

        while(!command.equals("Stop")){
            int number = Integer.parseInt(command);
            if (number>num){
                num = number;
            }
            command = scan.nextLine();
        }
        System.out.println(num);
    }
}
