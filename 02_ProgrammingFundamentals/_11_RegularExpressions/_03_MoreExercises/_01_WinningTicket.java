package _02_ProgrammingFundamentals._11_RegularExpressions._03_MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _01_WinningTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> tickets = Arrays.stream(scan.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());

        // Add variables
        List<String> winningTickets = new ArrayList<>();
        
        String regexTicket = "(?<grp>[$|@|#|^]{6,}).*(?<=.{10})(\\1)";
        // String regexTicket = "(?<grp>[$|@|#|^]{6,10})(?<grp2>.{1,})?(\\1)";
        // String regexTicket = "(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\\\\k<ch>{6,}).*(?<=.{10})\\\\k<match>.*";
        // String  regexTicket = "(?<grp>[$|@|#|^]{6,10})(?<grp2>.{1,})?(?<=.{10})(\\1)";
        Pattern patternTicket = Pattern.compile(regexTicket);

        // Determine the winning ticket and print result
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).length() == 20) {
                Matcher matcherTicket = patternTicket.matcher(tickets.get(i));

                if (matcherTicket.find()) {
                    winningTickets.add(tickets.get(i));
                    String match = matcherTicket.group("grp");

                    if (match.length() == 10) {
                        System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", tickets.get(i), match.length(), match.charAt(0));
                    } else {
                        System.out.printf("ticket \"%s\" - %d%s%n", tickets.get(i), match.length(), match.charAt(0));
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", tickets.get(i));
                }
            } else {
                System.out.printf("invalid ticket%n");
            }
        }

        scan.close();
    }
}
