package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrOne = scan.nextLine().split("\\s+");
        String[] arrTwo = scan.nextLine().split("\\s+");

        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrTwo.length; j++) {
                if(arrOne[i].equals(arrTwo[j])){
                    System.out.print(arrTwo[j] + " ");
                }
            }
        }
    }
}
