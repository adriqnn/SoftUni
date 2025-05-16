package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int[] numbersArray = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Add variables
        int number = numbersArray[0];
        int power = numbersArray[1];

        // Remove numbers based on value
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == number) {
                numbersList = removeNumbersFromListWithPower(numbersList, i, power);
                i--;
            }
        }

        // Create method to print the sum of the numbers
        printSum(numbersList);

        scan.close();
    }

    private static void printSum(List<Integer> numbersList) {
        int sum = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }

        System.out.println(sum);
    }

    private static List<Integer> removeNumbersFromListWithPower(List<Integer> numbersList, int i, int power) {
        List<Integer> newList = new ArrayList<>();

        if (i + power >= numbersList.size() - 1 && i - power < 0) {
            return newList;
        } else if (i + power >= numbersList.size() - 1) {
            for (int j = 0; j < i - power; j++) {
                newList.add(numbersList.get(j));
            }

            return newList;
        } else if (i - power < 0) {
            for (int j = i + power + 1; j < numbersList.size(); j++) {
                newList.add(numbersList.get(j));
            }

            return newList;
        } else {
            for (int j = 0; j < i - power; j++) {
                newList.add(numbersList.get(j));
            }

            for (int j = i + power + 1; j < numbersList.size(); j++) {
                newList.add(numbersList.get(j));
            }

            return newList;
        }
    }
}
