package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        int power = 1;

        // Loop through the powers of 2 from 2^0 to 2^n and print
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.println(1);
            } else if (i % 2 == 0) {
                System.out.println(power);
            }
            
            power = power * 2;
        }

        scan.close();
    }
}
