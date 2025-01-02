package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _06_MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String command = scan.nextLine();

        // Staging
        int num = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {
            int number = Integer.parseInt(command);

            // Check if the current number is greater than the current maximum
            if (number > num) {
                num = number;
            }
            
            command = scan.nextLine();
        }
        
        // Display the maximum number
        System.out.println(num);

        scan.close();
    }
}
