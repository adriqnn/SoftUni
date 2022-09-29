package _02_ProgrammingFundamentals._11_RegularExpressions._03_MoreExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _02_RageQuit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> unique = new TreeSet<>();
        String input = scan.nextLine();

        String regexInput = "(?<match>(?<string>[^0-9]+)(?<number>[0-9]+))";
        Pattern patternInput = Pattern.compile(regexInput);
        Matcher matcherInput = patternInput.matcher(input);

        StringBuilder result = new StringBuilder();

        while (matcherInput.find()){
            String stringType = matcherInput.group("string");
            int times = Integer.parseInt(matcherInput.group("number"));

            for (int i = 0; i < times; i++) {
                result.append(stringType.toUpperCase());
            }
            for (int i = 0; i < stringType.length(); i++) {
                unique.add((stringType.charAt(i) + "").toUpperCase());
            }


        }

//        System.out.println(unique.stream().collect(Collectors.joining("")));
//        Set<String> collect = result.chars().distinct().mapToObj(e -> Character.toString((char) e)).collect(Collectors.toSet());
//        System.out.println(collect.stream().collect(Collectors.joining("")));

        System.out.println(unique.size());
        System.out.printf("Unique symbols used: %d%n", result.chars().distinct().count());
        System.out.println(result);
        char e = 'C';
        System.out.println((e+"").toUpperCase());
    }
}
