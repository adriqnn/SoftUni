package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String num = scan.nextLine();

        // Create method for multiplication
        whatIf(num);

        scan.close();
    }

    private static void whatIf(String number) {
        int thisNumber = Math.abs(Integer.parseInt(number));
        String num = String.valueOf(thisNumber);

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < num.length(); i++) {
            char symbol = num.charAt(i);
            int n = Character.getNumericValue(symbol);

            if ( n % 2 == 0) {
                sumEven += n;
            } else {
                sumOdd += n;
            }
        }

        System.out.println(sumEven * sumOdd);
    }
}
