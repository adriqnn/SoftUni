package _02_ProgrammingFundamentals._11_RegularExpressions._02_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _05_NetherRealms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> console = Arrays.stream(scan.nextLine().split(",\\s*")).map(e -> e.replaceAll(" ", "")).collect(Collectors.toList());

        // String regexHealth = "[^\\d\\+\\-\\*\\/.]";
        // String regexAttack = "[+\\-]?[0-9]+\\.?[0-9]*";

        // Add variables
        String regexHealth = "[^0-9*/+\\-.]";
        Pattern patternHealth = Pattern.compile(regexHealth);

        String regexAttack = "[+-]?\\d+\\.?\\d*";
        Pattern patternAttack = Pattern.compile(regexAttack);

        String regexAction = "[*\\/]";
        Pattern patternAction = Pattern.compile(regexAction);

        List<Character> actions = new ArrayList<>();

        // Determine the result of the nether realm battle
        for (int i = 0; i < console.size(); i++) {
            Matcher matcherHealth = patternHealth.matcher(console.get(i));

            int health = 0;

            while (matcherHealth.find()) {
                health += matcherHealth.group().charAt(0);
            }

            Matcher matcherAttack = patternAttack.matcher(console.get(i));
            double attackDemons = 0;

            while (matcherAttack.find()) {
                attackDemons += Double.parseDouble(matcherAttack.group());
            }

            int countMultiply = 0;
            int countDivide = 0;

            for (int i1 = 0; i1 < console.get(i).length(); i1++) {
                if ((char) console.get(i).charAt(i1) == Character.valueOf('*')) {
                    countMultiply++;
                } else if ((char) console.get(i).charAt(i1) == '/') {
                    countDivide++;
                }
            }

            for (int i1 = 0; i1 < countDivide; i1++) {
                attackDemons /= 2;
            }
            for (int i1 = 0; i1 < countMultiply; i1++) {
                attackDemons *= 2;
            }

            // Print result
            System.out.printf("%s - %d health, %.2f damage%n", console.get(i), health, attackDemons);
        }

        scan.close();
    }
}

//    Matcher matcherAction = patternAction.matcher(console.get(i));
//        while (matcherAction.find()) {
//            actions.add(matcherAction.group().charAt(0));
//        }
//
//        for (int j = 0; j < actions.size(); j++) {
//            if (actions.get(j) == '*') {
//                attackDemons *= 2;
//            } else if (actions.get(j) == '/') {
//                attackDemons /=2;
//            }
//        }
