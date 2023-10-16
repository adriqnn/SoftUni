package _04_JavaOOP._01_WorkingWithAbstractionExercise._03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CardRanks cardRank = CardRanks.valueOf(scan.nextLine());
        CardSuits cardSuit = CardSuits.valueOf(scan.nextLine());
        
        Card card = new Card(cardSuit, cardRank);

        System.out.println(card);

        scan.close();
    }
}
