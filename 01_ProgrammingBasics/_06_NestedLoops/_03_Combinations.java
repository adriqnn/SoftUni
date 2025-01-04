package _01_ProgrammingBasics._06_NestedLoops;

import java.util.Scanner;

public class _03_Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());
        
        // Add variable
        int count = 0;

        for (int i = 0; i <= num ; i++) {
            for (int j = 0; j <= num ; j++) {
                for (int k = 0; k <= num ; k++) {
                    if (i + j + k == num) {
                        count++;
                    }
                }
            }
        }

         // Print the result
        System.out.println(count);
        
        scan.close();
    }
}
