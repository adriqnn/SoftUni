package _01_ProgrammingBasics._06_NestedLoopsExercise;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int num = Integer.parseInt(scan.nextLine());

        // Add variables
        int current = 1;
        boolean isBigger = false;
        
        // Print the number pyramid
        for (int rows = 1; rows <= num; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (current > num) {
                    isBigger = true;
                    break;
                }
                
                System.out.print(current + " ");
                current++;
            }
            
            if (isBigger) {
                break;
            }
            
            System.out.println();
        }

        scan.close();
    }
}
