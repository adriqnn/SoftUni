package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _03_SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int initialNum = Integer.parseInt(scan.nextLine());

        int sum = 0;

        // Use a while loop to continuously read numbers and add them to the sum
        while (sum < initialNum) {
            int currentNum = Integer.parseInt(scan.nextLine());
            sum += currentNum;
        }

        // Display the final sum
        System.out.println(sum);

        scan.close();
    }
}
