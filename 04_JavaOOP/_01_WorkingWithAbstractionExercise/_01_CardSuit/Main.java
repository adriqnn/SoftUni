package _04_JavaOOP._01_WorkingWithAbstractionExercise._01_CardSuit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits: ");
        for (CardSuits cardSuit : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(),cardSuit.name());
        }
    }
}
