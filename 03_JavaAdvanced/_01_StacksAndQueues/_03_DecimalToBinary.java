package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        if (num == 0){
            System.out.println(0);
            return;
        }
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        while (num != 0){
            binary.push(num%2);
            num /= 2;
        }
        while(!binary.isEmpty()){
            System.out.print(binary.pop());
        }
    }
}
