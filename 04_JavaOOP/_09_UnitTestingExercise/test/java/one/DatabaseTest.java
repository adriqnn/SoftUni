package unittesting.exercise.one;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DatabaseTest {
    private static final Integer[] NUMBERS = {1,2,3,4};
    private Database database;

    @Before
    public void prepare() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testConstructorShouldCreateValidDatabase() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
        Integer[] dbElements = database.getElements();
        Assert.assertEquals("Count of db elements is incorrect", dbElements.length, NUMBERS.length);
        for (int i = 0; i < NUMBERS.length; i++) {
            Assert.assertEquals("We have different elements in the database", dbElements[i],NUMBERS[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void tesConstructorThrowsExceptionForMoreThan16Elements() throws OperationNotSupportedException {
        Integer [] largeArray = new Integer[17];
        new Database(largeArray);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowsExceptionForLessThan1Elements() throws OperationNotSupportedException {
        Integer[] smallArray = new Integer[0];
        new Database(smallArray);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddThrowsExceptionWithNullArgument() throws OperationNotSupportedException {
        database.add(null);
    }

    //"Happy Path"
    @Test
    public void testAddShouldAddElement() throws OperationNotSupportedException {
        database.add(6);
        Integer[] dbElements = database.getElements();
        Assert.assertEquals(dbElements.length,NUMBERS.length + 1);
        Assert.assertEquals(dbElements[dbElements.length - 1],Integer.valueOf(6));
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveShouldTrowException() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        database.remove();
    }

    @Test
    public void testRemoveShouldRemoveLastElement() throws OperationNotSupportedException {
        database.remove();
        Integer[] dbElements = database.getElements();
        Assert.assertEquals(NUMBERS.length-1,dbElements.length);
        Assert.assertEquals(Integer.valueOf(3),dbElements[dbElements.length - 1]);
    }
}