package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  number = scan.nextLine();
        while(!number.equals("END")){
            System.out.println(isPalindromeInteger(number));
            number = scan.nextLine();
        }
    }
    private static boolean isPalindromeInteger(String number) {
        StringBuilder second = new StringBuilder();
        for (int i = number.length()-1; i >= 0; i--) {
            second.append(number.charAt(i));
        }
        int n1 = Integer.parseInt(number);
        int n2 = Integer.parseInt(second.toString());

        if (n1 == n2 ){
            return true;
        }else{
            return false;
        }
    }
}
