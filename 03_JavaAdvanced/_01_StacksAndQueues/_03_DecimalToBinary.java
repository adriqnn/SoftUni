package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        int num = Integer.parseInt(scan.nextLine());
        
        // Add variable
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        
        if (num == 0){
            System.out.println(0);
            return;
        }
        
        while (num != 0){
            binary.push(num % 2);
            num /= 2;
        }
        
        // Print result
        while(!binary.isEmpty()){
            System.out.print(binary.pop());
        }
        
        scan.close();
    }
}
