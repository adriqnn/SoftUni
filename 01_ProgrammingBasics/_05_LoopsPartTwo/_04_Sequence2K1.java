package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _04_Sequence2K1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int k = 1;

        while(k <= n){
            System.out.println(k);

            k = 2 * k + 1;
        }
    }
}
