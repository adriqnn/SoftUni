package hearthstone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PTest09 {

    protected class InputGenerator {


        private int[] damage = {3, 4, 5, 6, 7, 8, 10, 9};

        private int[] scores = {7, 15, 6, 9, 12, 3, 8};

        private int[] level = {1, 2, 3, 4, 5};

        public List<Card> generateCards(int count) {
            var names = generateNames(count);
            List<Card> competitors = new ArrayList<>();
            for (int i = 1; i <= count; i++) {

                competitors.add(new Card(names.get(i % names.size()), damage[i % damage.length] + i, scores[i % scores.length] + i, level[i % level.length]));
            }
            return competitors;
        }

        public List<String> generateNames(int count) {

            var list = new ArrayList<String>();
            for (int i = 0; i < count; i++) {
                list.add(String.format("%s card", UUID.randomUUID().toString() + i));
            }

            return list;
        }

    }

    private Board board;
    private InputGenerator inputGenerator;

    @Before
    public void setUp() {
        this.board = new BoardImpl();
        this.inputGenerator = new InputGenerator();
    }

    @Test
    public void play_250_000_card_only_10_000_rounds_and_remove_all() {

        int initialCount = 250000;

        List<Card> cards = this.inputGenerator.generateCards(initialCount);


        for (Card card : cards) {
            this.board.draw(card);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < cards.size() / 2; i++) {
            Card first = cards.get(i);
            Card second = cards.get(cards.size() - i - 1);
            if (first.getLevel() == second.getLevel()) {
                this.board.play(first.getName(), second.getName());
            }
        }
        for (Card card : cards) {
            this.board.remove(card.getName());
        }
        long stop = System.currentTimeMillis();
        long executionTimeInMillis = stop - start;
        Assert.assertTrue(executionTimeInMillis <= 115);

        ;
    }
}
