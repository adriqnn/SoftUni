package unittesting.exercise.three;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class ListIteratorTest {
    private static final String[] YEP = new String[]{"a","b","c","d"};//without new also is possible
    ListIterator listIterator;

    @Before
    public void prepare() throws OperationNotSupportedException {
        listIterator = new ListIterator(YEP);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowException() throws OperationNotSupportedException {
        new ListIterator(null);
    }

    @Test
    public void testConstructorShouldCreateListIterator() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("a","b","c","d");
    }

    @Test
    public void testHasNext(){
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertTrue(listIterator.hasNext());
        listIterator.move();
        Assert.assertFalse(listIterator.hasNext());
    }

    @Test
    public void testMove(){
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintShouldThrowExceptionForEmptyList() throws OperationNotSupportedException {
        listIterator = new ListIterator();
        listIterator.print();
    }

    @Test
    public void testPrintSuccess(){
        int index = 0;
        while(listIterator.hasNext()){
            Assert.assertEquals(YEP[index],listIterator.print());
            index++;
            listIterator.move();
        }
    }
}