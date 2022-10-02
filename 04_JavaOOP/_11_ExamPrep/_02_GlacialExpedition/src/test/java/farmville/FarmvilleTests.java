package farmville;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmvilleTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Farm

    @Before
    public void setUp(){

    }

    @Test
    public void testConstructor(){
        Farm farm1 = new Farm("House",10);
        Farm farm2 = new Farm("House",10);
        Assert.assertEquals(farm1.getName(),farm2.getName());
        Assert.assertEquals(farm1.getCapacity(),farm2.getCapacity());
    }

    @Test
    public void testGetCount(){
        Farm farm = new Farm("House",10);
        Animal animal = new Animal("a",10);
        farm.add(animal);
        Assert.assertEquals(1, farm.getCount());
    }

    @Test
    public void testGetName(){
        Farm farm = new Farm("House",10);
        Assert.assertEquals("House", farm.getName());
    }

    @Test
    public void testGetCapacity(){
        Farm farm = new Farm("House",10);
        Assert.assertEquals(10, farm.getCapacity());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testFarmIsFull(){
        Farm farm = new Farm("House",1);
        Animal animal1 = new Animal("a",10);
        Animal animal2 = new Animal("b",10);
        farm.add(animal1);
        farm.add(animal2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAnimaExists(){
        Farm farm = new Farm("House",10);
        Animal animal1 = new Animal("a",10);
        Animal animal2 = new Animal("a",10);
        farm.add(animal1);
        farm.add(animal2);
    }

    @Test
    public void testAdd(){
        Farm farm = new Farm("House",10);
        Animal animal1 = new Animal("a",10);
        farm.add(animal1);
        Assert.assertEquals(1,farm.getCount());
    }

    @Test
    public void testToReceiveFalse(){
        Farm farm = new Farm("House",10);
        Animal animal1 = new Animal("a",10);
        Animal animal2 = new Animal("b",10);
        farm.add(animal1);
        farm.add(animal2);
        Assert.assertFalse(farm.remove("c"));
    }

    @Test
    public void testToReceiveTrue(){
        Farm farm = new Farm("House",10);
        Animal animal1 = new Animal("a",10);
        Animal animal2 = new Animal("b",10);
        farm.add(animal1);
        farm.add(animal2);
        Assert.assertTrue(farm.remove("b"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetCapacity(){
        Farm farm = new Farm("House",-100);
    }

    @Test (expected = NullPointerException.class)
    public void testSetNameOne(){
        Farm farm = new Farm(null,10);
    }

    @Test (expected = NullPointerException.class)
    public void testSetNameTwo(){
        Farm farm = new Farm(" ",10);
    }




}
