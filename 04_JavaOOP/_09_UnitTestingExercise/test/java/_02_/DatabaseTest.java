package _04_JavaOOP._09_UnitTestingExercise._02_;

import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.*;

public class DatabaseTest {
    private static final Person[] PEOPLE = new Person[]{new Person(1, "A"), new Person(2, "B"), new Person(3, "C"), new Person(4, "D"), new Person(5, "E")};
    private Database database;
    private final Person testPerson = new Person(6, "F");

    @Before
    public void setUp() throws OperationNotSupportedException {
        this.database = createDatabase(PEOPLE);
    }

    private Database createDatabase(Person[] elements) throws OperationNotSupportedException {
        return new Database(elements);
    }

    @Test
    public void testConstructorSetAllCorrectParameters() {
        assertEquals(PEOPLE.length, this.database.getElements().length);
        assertArrayEquals(PEOPLE, this.database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorMustFailWhenParametersIsMoreThen16() throws OperationNotSupportedException {
        createDatabase(new Person[17]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorMustFailWhenParametersIsLessThen1() throws OperationNotSupportedException {
        createDatabase(new Person[0]);
    }

    @Test
    public void testAddTheElementMustBeAdded() throws OperationNotSupportedException {
        this.database.add(testPerson);
        assertEquals(PEOPLE.length + 1, this.database.getElements().length);
        Person actualPerson = this.database.getElements()[this.database.getElements().length - 1];
        assertEquals(testPerson.getId(), actualPerson.getId());
        assertEquals(testPerson.getUsername(), actualPerson.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testAddMustFailWhenParameterIsNull() throws OperationNotSupportedException {
        this.database.add(null);
    }

    @Test
    public void testRemoveElementWhenArrayIsNotEmpty() throws OperationNotSupportedException {
        this.database.remove();
        assertEquals(PEOPLE.length - 1, this.database.getElements().length);
        assertEquals(PEOPLE[PEOPLE.length - 2], this.database.getElements()[this.database.getElements().length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveWhenArrayLengthIsEmpty() throws OperationNotSupportedException {
        this.database = createDatabase(new Person[]{ testPerson });
        this.database.remove();
        this.database.remove();
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameMustFailsWhenNameIsNull() throws OperationNotSupportedException {
        this.database.findByUsername(null);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameWhenNameIsNotFind() throws OperationNotSupportedException {
        this.database.findByUsername("Z");
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameWhenFindMoreThenOneSameName() throws OperationNotSupportedException {
        this.database = createDatabase(new Person[]{testPerson, testPerson});
        this.database.findByUsername(testPerson.getUsername());
    }
    @Test
    public void testFindByUsernameReturnsCorrectObject() throws OperationNotSupportedException {
        assertEquals(PEOPLE[0], this.database.findByUsername("A"));
    }

    @Test
    public void testFindByIdReturnsCorrectObject() throws OperationNotSupportedException {
        assertEquals(PEOPLE[0], this.database.findById(1));
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByIdWhenFindMoreThenOneSameId() throws OperationNotSupportedException {
        this.database = createDatabase(new Person[]{testPerson, testPerson});
        this.database.findById(testPerson.getId());
    }

    @Test(expected = OperationNotSupportedException.class )
    public void testFindByIdWhenIdIsNotFind() throws OperationNotSupportedException {
        this.database.findById(7);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testFindByIdMustFailsWhenIdIsNull() throws OperationNotSupportedException {
        this.database = createDatabase(new Person[]{new Person(1, "A")});
        this.database.remove();
        this.database.findById(1);
    }
}
