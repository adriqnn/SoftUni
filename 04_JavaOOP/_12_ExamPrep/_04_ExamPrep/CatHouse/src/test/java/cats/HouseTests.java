package cats;

import org.junit.Assert;
import org.junit.Test;

public class HouseTests {

    @Test (expected = NullPointerException.class)
    public void testNull(){
        House house = new House(null, 5);
    }

    @Test (expected = NullPointerException.class)
    public void testEmpty(){
        House house = new House("  ", 5);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testBelowZero(){
        House house = new House("a", -100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFullHouse(){
        House house = new House("a", 1);
        Cat cat1 = new Cat("a");
        house.addCat(cat1);
        Cat cat2 = new Cat("b");
        house.addCat(cat2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemove(){
        House house = new House("a", 1);
        Cat cat = new Cat("a");
        house.removeCat("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForSale(){
        House house = new House("a", 1);
        Cat cat = new Cat("a");
        house.catForSale("a");
    }

    @Test
    public void testBoolean(){
        House house = new House("a", 1);
        Cat cat = new Cat("a");
        house.addCat(cat);
        house.catForSale("a");

        Assert.assertFalse(cat.isHungry());
    }

    @Test
    public void testStatistics(){
        House house = new House("a", 5);
        Cat cat1 = new Cat("a");
        house.addCat(cat1);
        Cat cat2 = new Cat("b");
        house.addCat(cat2);
        String expected = "The cat a, b is in the house a!";
        String actual = house.statistics();

        Assert.assertEquals(expected, actual);
    }

}
