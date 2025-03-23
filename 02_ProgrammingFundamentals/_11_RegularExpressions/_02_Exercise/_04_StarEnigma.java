package _02_ProgrammingFundamentals._11_RegularExpressions._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        String decrypt = "[sStTaArR]";
        Pattern decryptMessage = Pattern.compile(decrypt);
        List<String> messages = new ArrayList<>();

        // Decrypt message
        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();

            StringBuilder message = new StringBuilder();
            Matcher matcherMessage = decryptMessage.matcher(console);
            int count = 0;

            while (matcherMessage.find()) {
                count++;
            }

            for (int j = 0; j < console.length(); j++) {
                char symbol = (char) (console.charAt(j) - count);
                message.append(symbol);
            }

            messages.add(message.toString());
        }

        String regexPlan = "[^@\\-!:>]*?@(?<planet>[A-Z][a-z]*)[^@\\-!:>]*?:(?<population>[0-9]*)[^@\\-!:>]*?!(?<attackType>[DA])![^@\\-!:>]*?->(?<soldierCount>[0-9]*)[^@\\-!:>]*?";
        Pattern patternPlan = Pattern.compile(regexPlan);

        List<String> A = new ArrayList<>();
        List<String> D = new ArrayList<>();

        for (int i = 0; i < messages.size(); i++) {
            Matcher matchPlan = patternPlan.matcher(messages.get(i));

            if (matchPlan.find()) {
                String planet = matchPlan.group("planet");
                char attackType = matchPlan.group("attackType").charAt(0);

                if (attackType == 'A') {
                    A.add(planet);
                } else if (attackType == 'D') {
                    D.add(planet);
                }
            }
        }

        // Print result
        System.out.printf("Attacked planets: %d%n", A.size());
        A.stream().sorted().forEach(planet -> System.out.println("-> " + planet));
        System.out.printf("Destroyed planets: %d%n", D.size());
        D.stream().sorted().forEach(planet -> System.out.println("-> " + planet));

        scan.close();
    }
}
