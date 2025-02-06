package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            int numberInTheFront = numbers[0];
            int[] changingArray = new int[numbers.length];

            for (int j = 0; j < numbers.length - 1; j++) {
                changingArray[j] = numbers[j + 1];
            }

            changingArray[changingArray.length - 1] = numberInTheFront;
            numbers = changingArray;
        }

        // Print result
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
