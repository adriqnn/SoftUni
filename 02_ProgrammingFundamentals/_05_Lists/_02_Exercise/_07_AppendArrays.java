package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _07_AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scan.nextLine().split("\\|+")).collect(Collectors.toList());

        Collections.reverse(numbersList);

        System.out.println(numbersList.toString().replace("[", "").replace("]","").replaceAll(",","").replaceAll("\\s+"," "));

    }
}
