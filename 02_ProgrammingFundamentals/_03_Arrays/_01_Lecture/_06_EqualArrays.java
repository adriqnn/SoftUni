package _02_ProgrammingFundamentals._03_Arrays._01_Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number1 = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] number2 = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isEqual = true;
        for (int i = 0; i < number1.length; i++) {
            if(number1[i] == number2[i]){
                sum += number1[i];
            }else{
                isEqual = false;
                sum = i;
                break;
            }
        }
        if(isEqual){
            System.out.println("Arrays are identical. Sum: " + sum);
        }else{
            System.out.println("Arrays are not identical. Found difference at "+sum+" index.");
        }
    }
}
