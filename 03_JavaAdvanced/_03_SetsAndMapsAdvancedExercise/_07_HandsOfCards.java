package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.*;

public class _07_HandsOfCardsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        String console;
        
        // Add variable
        LinkedHashMap<String, Set<String>> playersCards = new LinkedHashMap<>();

        // Determine the card values for all the players
        while (!(console = scan.nextLine()).equals("JOKER")) {
            String[] parts = console.split(": ");
            String name = parts[0];
            String[] cardsStringArray = parts[1].split(", ");
            
            Set<String> cards = new HashSet<>(Arrays.asList(cardsStringArray));

            playersCards.merge(name, cards, (existingCards, newCards) -> {
                existingCards.addAll(newCards);
                return existingCards;
            });
        }

        // Print result
        playersCards.forEach((name, cards) -> {
            int points = getCardsPoints(cards);
            System.out.printf("%s: %d%n", name, points);
        });

        scan.close();
    }

    // Method that gets the cards points
    private static int getCardsPoints(Set<String> cards) {
        Map<Character, Integer> points = getPartOfCardValue();
        
        int sumCards = 0;

        for (String card : cards) {
            int sum = 0;
            
            if (card.length() == 3) {
                char type = card.charAt(2);
                sum = 10 * points.get(type);
            } else {
                char number = card.charAt(0);
                char type = card.charAt(1);
                sum = points.get(number) * points.get(type);
            }
            
            sumCards += sum;
        }

        return sumCards;
    }

    // Method that gets the card value
    private static Map<Character, Integer> getPartOfCardValue() {
        Map<Character, Integer> points = new HashMap<>();

        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}

