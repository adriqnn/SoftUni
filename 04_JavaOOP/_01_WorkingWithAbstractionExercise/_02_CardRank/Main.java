package _04_JavaOOP._01_WorkingWithAbstractionExercise._02_CardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks: ");

        for(CardRanks cardRank : CardRanks.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
