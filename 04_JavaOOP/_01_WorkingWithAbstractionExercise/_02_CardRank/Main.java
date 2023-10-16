package _04_JavaOOP._01_WorkingWithAbstractionExercise._02_CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        CardRanks cardRank = CardRanks.valueOf(scan.nextLine());
        CardSuits cardSuit = CardSuits.valueOf(scan.nextLine());
        
        //System.out.println("Card name: %s of %s; Card power: %d", ... );

        Card card = new Card(cardSuit, cardRank);
        
        System.out.println(card);
        
        scan.close();
    }
}
