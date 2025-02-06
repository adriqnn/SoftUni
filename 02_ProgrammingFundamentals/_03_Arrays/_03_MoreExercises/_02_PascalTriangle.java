package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

import java.util.Scanner;

public class _02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Print pascal triangle
        for (int i = 0; i < n; i++) {
            int number = 1;
            
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }

        scan.close();
    }
}
