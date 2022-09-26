package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        middleString(console);
    }

    private static void  middleString(String console) {
        if (console.length() % 2 == 0){
            System.out.printf("%c%c",console.charAt(console.length()/2-1),console.charAt(console.length()/2));
        }else{
            System.out.println(console.charAt(console.length()/2));
        }
    }
}
