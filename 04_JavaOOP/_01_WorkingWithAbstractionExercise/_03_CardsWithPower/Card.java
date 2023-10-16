package _04_JavaOOP._01_WorkingWithAbstractionExercise._03_CardsWithPower;

public class Card {
    private CardSuits cardSuit;
    private CardRanks cardRank;

    public Card(CardSuits cardSuit, CardRanks cardRank){
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int getPower(){
        return this.cardRank.getRankPower() + this.cardSuit.getSuitPower();
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",this.cardRank,this.cardSuit,this.getPower());
    }
}
