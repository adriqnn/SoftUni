package _04_JavaOOP._09_UnitTestingExercise._05_;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {
    private static final Integer testIntegerOne = 10;
    private static final Integer testIntegerTwo = 20;
    private static final Integer testIntegerThree = 30;
    private static final Integer testIntegerFour = 40;
    private CustomLinkedList<Integer> list;

    @Before
    public void setUp() {
        this.list = new CustomLinkedList<>();
        this.list.add(testIntegerOne);
        this.list.add(testIntegerTwo);
        this.list.add(testIntegerThree);
    }

    @Test
    public void testConstructorShouldSetCorrectValue() {
        this.list = new CustomLinkedList<>();
        assertFalse(this.list.contains(null));
    }

    @Test
    public void testAddDataShouldMustAddCorrectData() {
        assertEquals(testIntegerThree, this.list.get(2));
        assertEquals(testIntegerTwo, this.list.get(1));
        assertEquals(testIntegerOne, this.list.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMustFailsWhenIndexOutOfBounds() {
        this.list = new CustomLinkedList<>();
        this.list.get(0);
    }

    @Test
    public void testRemoveDataFromSpecifiedIndexMustReturnCorrectData() {
        assertEquals(testIntegerTwo, this.list.removeAt(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveDataFromSpecifiedIndexMustFailsWhenIndexOutOfBounds() {
        this.list.removeAt(4);
    }

    @Test
    public void testRemoveDataIfExistReturnIndexOfRemovedData() {
        assertEquals(0, this.list.remove(testIntegerOne));
    }

    @Test
    public void testRemoveIfDataIsNotExistReturnNegativeIndex() {
        assertEquals(-1, this.list.remove(testIntegerFour));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveAllDataMustFailsWhenContinueRemovingAfterListIsEmpty(){
        this.list.removeAt(0);
        this.list.removeAt(0);
        this.list.removeAt(0);
        this.list.removeAt(0);
    }

    @Test
    public void testIndexOfMustReturnCorrectIndexOfGivenObject() {
        assertEquals(2, this.list.indexOf(testIntegerThree));
        assertEquals(0, this.list.indexOf(testIntegerOne));
    }

    @Test
    public void testSetMustSetCorrectValueAtTheGivenIndex() {
        this.list.set(0, testIntegerFour);
        assertEquals(testIntegerFour, this.list.get(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMustFailsIfTheGivenIndexIsOutOfBoundsOrListIsEmpty() {
        this.list.set(4, testIntegerFour);
        this.list = new CustomLinkedList<>();
        this.list.set(0, testIntegerFour);
    }
}
