package _04_JavaOOP._09_UnitTestingExercise._03_;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {
    private static final String[] testArray = new String[]{"a", "b", "c", "d"}; // without new also is possible
    ListIterator listIterator;

    @Before
    public void prepare() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(testArray);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowException() throws OperationNotSupportedException {
        new ListIterator(null);
    }

    @Test
    public void testConstructorShouldCreateListIterator() throws OperationNotSupportedException {
        ListIterator listIterator = new ListIterator("a", "b", "c", "d");
    }

    @Test
    public void testHasNext(){
        Assert.assertTrue(this.listIterator.hasNext());
        this.listIterator.move();
        Assert.assertTrue(this.listIterator.hasNext());
        this.listIterator.move();
        Assert.assertTrue(this.listIterator.hasNext());
        this.listIterator.move();
        Assert.assertFalse(this.listIterator.hasNext());
    }

    @Test
    public void testMove(){
        Assert.assertTrue(this.listIterator.move());
        Assert.assertTrue(this.listIterator.move());
        Assert.assertTrue(this.listIterator.move());
        Assert.assertFalse(this.listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrintShouldThrowExceptionForEmptyList() throws OperationNotSupportedException {
        listIterator = new ListIterator();
        listIterator.print();
    }

    @Test
    public void testPrintSuccess(){
        int index = 0;
        
        while(this.listIterator.hasNext()){
            Assert.assertEquals(testArray[index], this.listIterator.print());
            index++;
            this.listIterator.move();
        }
    }
}
