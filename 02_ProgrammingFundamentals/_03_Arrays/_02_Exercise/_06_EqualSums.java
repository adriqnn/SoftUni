package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        int arrayIndex = 0;

        boolean isEqual = false;
        for (int i = 0; i < numbersArray.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += numbersArray[j];
            }
            for (int j = i+1; j < numbersArray.length; j++) {
                sumRight += numbersArray[j];
            }
            if (sumLeft == sumRight){
                isEqual = true;
                arrayIndex = i;
                break;
            }
        }
        if (isEqual){
            System.out.println(arrayIndex);
        }else{
            System.out.println("no");
        }
    }
}
