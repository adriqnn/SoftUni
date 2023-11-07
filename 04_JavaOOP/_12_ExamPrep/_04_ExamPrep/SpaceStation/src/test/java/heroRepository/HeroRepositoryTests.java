package heroRepository;

import org.junit.Assert;
import org.junit.Test;

import java.lang.instrument.UnmodifiableClassException;

public class HeroRepositoryTests {

    @Test (expected = NullPointerException.class)
    public void testCreateOne(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCreateTwo(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        heroRepository.create(hero1);
        Hero hero2 = new Hero("a", 2);
        heroRepository.create(hero2);
    }

    @Test
    public void testCreateThree(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        String actual = heroRepository.create(hero1);
        String expected = "Successfully added hero a with level 2";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCreateFour(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        heroRepository.create(hero1);

        Assert.assertEquals(1, heroRepository.getHeroes().size());
    }

    @Test(expected = NullPointerException.class)
    public void testRemove1(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.remove(null);
    }

    @Test(expected = NullPointerException.class)
    public void testRemove2(){
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.remove("   ");
    }

    @Test
    public void testRemove3(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        heroRepository.create(hero1);

        Assert.assertTrue(heroRepository.remove("a"));
    }

    @Test
    public void testGetHero(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        Hero hero2 = new Hero("b", 3);
        Hero hero3 = new Hero("c", 4);
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);

        Assert.assertEquals(4, heroRepository.getHeroWithHighestLevel().getLevel());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetHeroes(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        Hero hero2 = new Hero("b", 3);
        Hero hero3 = new Hero("c", 4);
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        heroRepository.getHeroes().clear();
    }

    @Test
    public void testConstructor(){
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        heroRepository.create(hero1);

        Assert.assertEquals(1, heroRepository.getCount());
    }

    @Test
    public void testNullOne(){
        HeroRepository heroRepository = new HeroRepository();

        Assert.assertNull(heroRepository.getHeroWithHighestLevel());
    }

    @Test
    public void testGetHeroMethod() {
        HeroRepository heroRepository = new HeroRepository();
        Hero hero1 = new Hero("a", 2);
        Hero hero2 = new Hero("b", 3);
        Hero hero3 = new Hero("c", 4);
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);

        Assert.assertEquals(hero1.getName(), heroRepository.getHero("a").getName());
    }

        @Test
    public void testNullTwo(){
        HeroRepository heroRepository = new HeroRepository();

        Assert.assertNull(heroRepository.getHero("f"));
    }
}
