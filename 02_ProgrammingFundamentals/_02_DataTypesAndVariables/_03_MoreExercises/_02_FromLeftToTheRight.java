package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            long[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToLong(Long::parseLong).toArray();
            int sum = 0;
            if (numbersArray[0] >= numbersArray[1]){
                numbersArray[0] = Math.abs(numbersArray[0]);
                while (numbersArray[0] > 0){
                    sum += numbersArray[0]%10;
                    numbersArray[0] = numbersArray[0]/10;
                }
            }else {
                numbersArray[1] = Math.abs(numbersArray[1]);
                while (numbersArray[1] > 0){
                    sum += numbersArray[1]%10;
                    numbersArray[1] = numbersArray[1]/10;
                }
            }
            System.out.println(sum);
        }
    }
}
