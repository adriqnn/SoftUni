package _01_Programming_Basics._05_LoopsPartTwo;

import java.util.Scanner;

public class _01_ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            String console = scan.nextLine();

            if (console.equals("Stop")){
                break;
            }

            System.out.println(console);
        }
    }
}
