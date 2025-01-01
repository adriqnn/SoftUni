package _01_ProgrammingBasics._04_LoopsPartOne;

import java.util.Scanner;

public class _02_NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Loop from n down to 1 and print each number
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }

        scan.close();
    }
}
