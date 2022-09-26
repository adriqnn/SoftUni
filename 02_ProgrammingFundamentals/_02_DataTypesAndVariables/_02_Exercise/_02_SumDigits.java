package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _02_SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        int sum = 0;
        for (int i = 0; i < console.length(); i++) {
            char symbol = console.charAt(i);
            int n = Character.getNumericValue(symbol);
            sum += n;
        }
        System.out.println(sum);
    }
}
