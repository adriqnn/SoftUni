package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine().toLowerCase();
        printVowelsSum(console);
    }

    private static void printVowelsSum(String console) {

        int count = 0;
        for (int i = 0; i < console.length(); i++) {
            switch(console.charAt(i)){
                case 'a':
                case 'y':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
