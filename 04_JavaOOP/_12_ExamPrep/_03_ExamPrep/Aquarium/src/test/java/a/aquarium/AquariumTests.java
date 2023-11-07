package a.aquarium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AquariumTests {

    @Test
    public void testConstructor(){
        Aquarium test  = new Aquarium("a", 3);
        Assert.assertEquals("a", test.getName());
    }

    @Test
    public void testConstructor2(){
        Aquarium test = new Aquarium("a", 3);
        Assert.assertEquals(3, test.getCapacity());
    }

    @Test (expected = NullPointerException.class)
    public void testSetNull(){
        Aquarium aquarium = new Aquarium(null, 1);
    }

    @Test (expected = NullPointerException.class)
    public void testSetSpace(){
        Aquarium aquarium = new Aquarium("    ", 1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSetZero(){
        Aquarium aquarium = new Aquarium("a", -1);
    }

    @Test
    public void testGetCount(){
        Aquarium aquarium = new Aquarium("a", 10);
        Fish fish = new Fish("a");
        aquarium.add(fish);

        Assert.assertEquals(1, aquarium.getCount());
    }

    @Test
    public void testAdd(){
        Aquarium aquarium = new Aquarium("a", 10);
        Fish fish = new Fish("a");

        Assert.assertEquals(0, aquarium.getCount());

        aquarium.add(fish);

        Assert.assertEquals(1, aquarium.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddFish(){
        Aquarium aquarium = new Aquarium("a", 0);
        Fish fish = new Fish("a");
        aquarium.add(fish);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveFish(){
        Aquarium aquarium = new Aquarium("a", 10);
        aquarium.remove("b");
    }

    @Test
    public void testActualRemove(){
        Aquarium aquarium = new Aquarium("a", 10);
        Fish fish = new Fish("a");
        aquarium.add(fish);

        Assert.assertEquals(1, aquarium.getCount());

        aquarium.remove("a");

        Assert.assertEquals(0, aquarium.getCount());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testSellFish(){
        Aquarium aquarium = new Aquarium("a", 10);
        Fish fish = new Fish("a");
        aquarium.sellFish("b");
    }

    @Test
    public void testSell(){
        Aquarium aquarium = new Aquarium("a", 10);
        Fish fish1 = new Fish("a");
        aquarium.add(fish1);
        Fish fish2 = aquarium.sellFish("a");
        Assert.assertEquals(fish1.getName(), fish2.getName());
    }

    @Test
    public void testReport(){
        Aquarium aquarium = new Aquarium("a",10);
        Fish fish1 = new Fish("a");
        Fish fish2 = new Fish("b");

        aquarium.add(fish1);
        aquarium.add(fish2);

        String expected = "Fish available at a: a, b";
        String report = aquarium.report();

        Assert.assertEquals(expected, report);
    }

    @Test
    public void testBoolean(){
        Aquarium aquarium = new Aquarium("a",10);
        Fish fish = new Fish("a");
        aquarium.add(fish);

        Assert.assertTrue(fish.isAvailable());

        aquarium.sellFish("a");

        Assert.assertFalse(fish.isAvailable());
    }
}

