package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _03_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input values
        Set<Integer> firstDeck = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondDeck = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));
        
        // Add variable
        int rounds = 50;
        
        // Play war card game
        while(rounds-- > 0 && !firstDeck.isEmpty() && !secondDeck.isEmpty()){
            Iterator<Integer> firstIterator = firstDeck.iterator();
            Iterator<Integer> secondIterator = secondDeck.iterator();
            
            int firstCard = firstIterator.next();
            firstIterator.remove();
            
            int secondCard = secondIterator.next();
            secondIterator.remove();
            
            if(firstCard > secondCard){
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            }else if (secondCard > firstCard){
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
        }
        
        // Print result
        if(firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        }else if(secondDeck.size() > firstDeck.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
        
        scan.close();
    }
}
