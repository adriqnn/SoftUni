package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = Integer.parseInt(scan.nextLine());

        int yield = 0;
        int days = 0;
        while (total >= 100){
            yield += total;
            total -= 10;
            days++;
            yield -= 26;
        }
        if (yield>=26){
            yield -= 26;
        }
        System.out.println(days);
        System.out.println(yield);
    }
}
