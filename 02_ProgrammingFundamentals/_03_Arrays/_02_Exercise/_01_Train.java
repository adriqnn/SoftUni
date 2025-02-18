package _02_ProgrammingFundamentals._03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int countOfTrainWagons = Integer.parseInt(scan.nextLine());

        // Add variables
        int[] train = new int[countOfTrainWagons];
        int sum = 0;

        // Add passengers to the train and sum all of them
        for (int i = 0; i < countOfTrainWagons; i++) {
            train[i] = scan.nextInt();
            sum += train[i];
        }

        // Print result
        Arrays.stream(train).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(sum);

        scan.close();
    }
}
