package _04_JavaOOP._09_UnitTesting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
    @Test
    public void testWeaponLosesDurabilityAfterAttack(){
        //Arrange
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(100, 100);
        //Act
        axe.attack(dummy);
        //Assert
        Assert.assertEquals(9, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeAttackThrowsIfAxeIsBroken(){
        Axe brokenAxe = new Axe(10, 0);
        brokenAxe.attack(null);
    }
}
