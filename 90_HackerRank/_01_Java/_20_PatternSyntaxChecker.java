package _05_HackerRank._01_Java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _20_PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String pattern = scan.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
