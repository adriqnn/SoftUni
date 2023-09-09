package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int number = Integer.parseInt(scan.nextLine());

        // Add variable
        ArrayDeque<Integer> binaryValue = new ArrayDeque<>();

        if (number == 0){
            System.out.println(0);
            return;
        }

        // Convert decimal to binary
        while (number != 0){
            binaryValue.push(number % 2);
            number /= 2;
        }

        // Print result
        while(!binaryValue.isEmpty()){
            System.out.print(binaryValue.pop());
        }

        scan.close();
    }
}
