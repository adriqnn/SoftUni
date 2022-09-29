package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.*;

public class _07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String, Set<String>> playersCards = new LinkedHashMap<>();
        String console = scan.nextLine();
        while(!console.equals("JOKER")){
            String name = console.split(": ")[0];
            String[] cardsStringArray = console.split(": ")[1].split(", ");
            Set<String> cards = new HashSet<>();
            Collections.addAll(cards,cardsStringArray);
            if(playersCards.containsKey(name)){
                Set<String> currentCards = playersCards.get(name);
                currentCards.addAll(cards);
                playersCards.put(name,currentCards);
            }else{
                playersCards.put(name,cards);
            }
            console = scan.nextLine();
        }
        playersCards.entrySet().forEach(e -> {
            String name = e.getKey();
            int points = getCardsPoints(e.getValue());
            System.out.printf("%s: %d%n",name,points);
        });
    }

    private static int getCardsPoints(Set<String> value) {
        Map<Character,Integer> points = getPartOfCardValue();
        int sumCards = 0;
        for (String v : value) {
            int sum = 0;
            if(v.contains("10")){
                char type = v.charAt(2);
                sum = 10 * points.get(type);
            }else{
                char number = v.charAt(0);
                char type = v.charAt(1);
                sum = points.get(number) * points.get(type);
            }
            sumCards += sum;
        }
        return sumCards;
    }
    private static Map<Character,Integer> getPartOfCardValue(){
        Map<Character, Integer> points = new HashMap<>();
        points.put('2',2);
        points.put('3',3);
        points.put('4',4);
        points.put('5',5);
        points.put('6',6);
        points.put('7',7);
        points.put('8',8);
        points.put('9',9);
        points.put('J',11);
        points.put('Q',12);
        points.put('K',13);
        points.put('A',14);
        points.put('S',4);
        points.put('H',3);
        points.put('D',2);
        points.put('C',1);
        return points;
    }
}
