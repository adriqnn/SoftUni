package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> cardsList1 = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cardsList2 = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Play card game and determine who wins
        while (cardsList1.size() > 0 && cardsList2.size() > 0) {
            if (cardsList1.get(0).equals(cardsList2.get(0))) {
                cardsList1.remove(0);
                cardsList2.remove(0);
            } else if (cardsList1.get(0) > cardsList2.get(0)) {
                cardsList1.add(cardsList1.get(0));
                cardsList1.add(cardsList2.get(0));

                cardsList1.remove(0);
                cardsList2.remove(0);
            } else if (cardsList1.get(0) < cardsList2.get(0)) {
                cardsList2.add(cardsList2.get(0));
                cardsList2.add(cardsList1.get(0));

                cardsList1.remove(0);
                cardsList2.remove(0);
            }
        }

        int sum = 0;

        // Print result
        if (cardsList1.isEmpty()) {
            for (Integer integer : cardsList2) {
                sum += integer;
            }

            System.out.printf("Second player wins! Sum: %d%n", sum);
        } else {
            for (Integer integer : cardsList1) {
                sum += integer;
            }

            System.out.printf("First player wins! Sum: %d%n", sum);
        }

        scan.close();
    }
}
