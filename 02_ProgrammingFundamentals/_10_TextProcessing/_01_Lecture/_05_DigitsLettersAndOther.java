package _02_ProgrammingFundamentals._10_TextProcessing._01_Lecture;

import java.util.Scanner;

public class _05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < console.length(); i++) {
            char symbol = console.charAt(i);
            if (Character.isDigit(symbol)){
                digits.append(symbol);
            }else if(Character.isLetter(symbol)){
                letters.append(symbol);
            }else{
                other.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}
