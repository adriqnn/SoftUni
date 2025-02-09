package _02_ProgrammingFundamentals._05_Lists._03_MoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        StringBuilder console = new StringBuilder(scan.nextLine());

        // Add variables
        List<Integer> decryptIntegers = new ArrayList<>();
        List<String> decryptStrings = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        // Determine if char is digit or not
        for (int i = 0; i < console.length(); i++) {
            char symbol = console.charAt(i);

            if (Character.isDigit(symbol)) {
                decryptIntegers.add(Character.getNumericValue(symbol));
            } else {
                decryptStrings.add(Character.toString(symbol));
            }
        }

        // Determine the needed integers
        for (int i = 0; i < decryptIntegers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(decryptIntegers.get(i));
            } else {
                skipList.add(decryptIntegers.get(i));
            }
        }


        StringBuilder fromDecryptStrings = new StringBuilder();
        decryptStrings.stream().forEach(fromDecryptStrings::append);

        StringBuilder result = new StringBuilder();

        // Decrypt String
        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            int skip = skipList.get(i);

            try {
                try {
                    for (int j = 0; j < take; j++) {
                        result.append(fromDecryptStrings.charAt(j));
                    }

                    fromDecryptStrings.delete(0, take);
                    fromDecryptStrings.delete(0, skip);
                } catch (Exception e) {
                }
            } catch (Exception e) {
            }
        }

        // Print result
        System.out.println(result);

        scan.close();
    }
}
