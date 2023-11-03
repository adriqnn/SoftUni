package _04_JavaOOP._09_UnitTesting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {
    private static final int HEALTH = 100;
    private static final int XP = 50;

    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setDummy(){
        this.dummy = new Dummy(HEALTH, XP);
        this.deadDummy = new Dummy(0, XP);
    }

    @Test
    public void testDummyLosesHealthWhenAttacked(){
        int attackPoints = 10;
        dummy.takeAttack(attackPoints);
        assertEquals(HEALTH-attackPoints, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowsWhenAttacked(){
        deadDummy.takeAttack(10);
    }

    @Test
    public void testDummyGivesXp(){
        int actual = deadDummy.giveExperience();
        assertEquals(XP, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyThrowsWhenGivingXP(){
        dummy.giveExperience();
    }
}
