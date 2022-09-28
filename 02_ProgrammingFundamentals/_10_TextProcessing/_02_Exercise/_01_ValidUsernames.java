package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] console = scan.nextLine().split(", ");

        for (int i = 0; i < console.length; i++) {
            if(console[i].length() >= 3 && console[i].length() <= 16){
                boolean isValid = true;
                for (int j = 0; j < console[i].length(); j++) {
                    char symbol = console[i].charAt(j);
                    if(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_' ){

                    }else{
                        isValid = false;
                    }
                }
                if(isValid){
                    System.out.println(console[i]);
                }
            }
        }
    }
}
