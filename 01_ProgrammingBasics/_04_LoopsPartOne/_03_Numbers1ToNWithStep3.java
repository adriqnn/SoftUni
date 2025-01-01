package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _03_Numbers1ToNWithStep3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Loop from 1 to n with a step of 3 and print each number
        for (int i = 1; i <= n; i = i + 3) {
            System.out.println(i);
        }

        scan.close();
    }
}
