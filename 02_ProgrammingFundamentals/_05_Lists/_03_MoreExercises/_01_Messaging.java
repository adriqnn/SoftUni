package _02_ProgrammingFundamentals._05_Lists._03_MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Messaging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        StringBuilder consoleSentence = new StringBuilder(scan.nextLine());

        for (int i = 0; i < numbersList.size(); i++) {
            String number = numbersList.get(i).toString();
            int sum = 0;
            for (int j = 0; j < number.length(); j++) {
                char symbol = number.charAt(j);
                sum += Character.getNumericValue(symbol);
            }
            numbersList.set(i,sum);
        }
        StringBuilder lineToPrint = new StringBuilder();
        for (int i = 0; i < numbersList.size(); i++) {
            while(numbersList.get(i) > consoleSentence.length()-1){
                numbersList.set(i,(numbersList.get(i)) - (consoleSentence.length()));

            }
            lineToPrint.append(consoleSentence.charAt(numbersList.get(i)));
            consoleSentence.deleteCharAt(numbersList.get(i));
        }
        System.out.println(lineToPrint);
    }
}
