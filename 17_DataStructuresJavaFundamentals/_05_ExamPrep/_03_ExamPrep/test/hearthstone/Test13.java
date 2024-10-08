package hearthstone;

import org.junit.Before;
import org.junit.Test;

public class Test13 {

    private Board board;

    @Before
    public void setUp() {
        this.board = new BoardImpl();
    }


    @Test(expected = IllegalArgumentException.class)
    public void remove_card_with_non_existing_name_should_throw_exception() {
        //Arrange
        Card card = new Card("Gnome the grudge", 10, 20, 5);
        Card card2 = new Card("Magic Card", 10, 15, 5);
        Card card3 = new Card("No magic Card", 6, 8, 3);
        Card card4 = new Card("Simple card", 10, 8, 3);


        //Act
        board.draw(card);
        board.draw(card2);
        board.draw(card3);
        board.draw(card4);


        //Assert
        board.remove("Pesho Card");

    }
}
