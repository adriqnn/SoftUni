package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] console = scan.nextLine().split("\\s+");
        String one = console[0];
        String two = console[1];

        int sum = 0;
        if(one.length() > two.length()){
            for (int i = 0; i < two.length(); i++) {
                sum += one.charAt(i)*two.charAt(i);
            }
            for (int i = two.length(); i < one.length(); i++) {
                sum += one.charAt(i);
            }
        }else if(one.length() < two.length()){
            for (int i = 0; i < one.length(); i++) {
                sum += one.charAt(i)*two.charAt(i);
            }
            for (int i = one.length(); i < two.length(); i++) {
                sum += two.charAt(i);
            }
        }else{
            for (int i = 0; i < two.length(); i++) {
                sum += one.charAt(i)*two.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
