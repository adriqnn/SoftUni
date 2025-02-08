package _02_ProgrammingFundamentals._04_Methods._02_Exercise;

import java.util.Scanner;

public class _09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String  number = scan.nextLine();

        // Cycle through and print result
        while(!number.equals("END")){
            // Create method that determines if the input is palindrome
            System.out.println(isPalindromeInteger(number));

            number = scan.nextLine();
        }

        scan.close();
    }

    private static boolean isPalindromeInteger(String number) {
        StringBuilder second = new StringBuilder();

        for (int i = number.length() - 1; i >= 0; i--) {
            second.append(number.charAt(i));
        }

        int n1 = Integer.parseInt(number);
        int n2 = Integer.parseInt(second.toString());

        return n1 == n2;
    }
}
