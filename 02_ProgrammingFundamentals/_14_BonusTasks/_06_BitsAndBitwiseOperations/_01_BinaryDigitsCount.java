package _02_ProgrammingFundamentals._14_BonusTasks._00_05_BitwiseOperations;

import java.util.Scanner;

public class _01_BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String bit = scan.nextLine();

        String binaryNum = Integer.toBinaryString(num);
        int counter = 0;

        for (int i = 0; i < binaryNum.length(); i++) {
            if(bit.charAt(0) == binaryNum.charAt(i)){
                counter++;
            }
        }

        System.out.println(counter);

        scan.close();
    }
}
