package shopAndGoods;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;
import java.util.Map;

public class ShopTest {
    // TODO
    private Shop shop;

    @Before
    public void setUp(){
        this.shop = new Shop();
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetShelvesShouldReturnUnmodifiableCollection(){
        shop.getShelves().clear();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsShouldFailForInvalidShelve() throws OperationNotSupportedException {
        shop.addGoods("invalid_test_shelve", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddGoodsShouldFailForExistingGood() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good", "test_code");
        shop.addGoods("Shelves1", goods);
        shop.addGoods("Shelves1", goods);
    }

    @Test
    public void testAddGoodsShouldReturnCorrectMessageOnAddition() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good", "test_code");
        String expected = "Goods: test_code is placed successfully!";
        String actual = shop.addGoods("Shelves1", goods);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveGoodsShouldFailForInvalidShelve() throws OperationNotSupportedException {
        shop.removeGoods("invalid_test_shelve", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveGoodsShouldFailForDifferentGoodOnTheSameShelve() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good", "test_code");
        Goods goodsOther = new Goods("test_good_other", "test_code_other");
        shop.addGoods("Shelves1", goods);
        shop.removeGoods("Shelves1", goodsOther);
    }

    @Test
    public void testRemoveGoodsShouldReturnCorrectMessage() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good", "test_code");
        shop.addGoods("Shelves1", goods);
        String expected = "Goods: test_code is removed successfully!";
        String actual = shop.removeGoods("Shelves1", goods);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveGoodsShouldSetTheShelveValueToNull() throws OperationNotSupportedException {
        Goods goods = new Goods("test_good", "test_code");
        shop.addGoods("Shelves1", goods);
        shop.removeGoods("Shelves1", goods);

        Goods emptySlot = shop.getShelves().get("Shelves1");

        Assert.assertNull(emptySlot);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddGoodDoesNotContainKey() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.addGoods("Shelves13",goods);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetNull() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.addGoods("Shelves1",goods);
        shop.addGoods("Shelves1",goods);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testBoolean() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.addGoods("Shelves1",goods);
        shop.addGoods("Shelves2",goods);
    }

    @Test
    public void testPut() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.addGoods("Shelves1",goods);
        Assert.assertEquals(goods,shop.getShelves().get("Shelves1"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemoveGoodDoesNotContainKey() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.removeGoods("Shelves13",goods);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRemove() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.removeGoods("Shelves1",goods);
    }

    @Test
    public void assertNull() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.addGoods("Shelves1",goods);
        shop.removeGoods("Shelves1",goods);
        Assert.assertNull(shop.getShelves().get("Shelves1"));
    }

    @Test
    public void assertString() throws OperationNotSupportedException {
        Shop shop = new Shop();
        Goods goods = new Goods("a","a");
        shop.addGoods("Shelves1",goods);
        String b = "Goods: a is removed successfully!";
        Assert.assertEquals(b,shop.removeGoods("Shelves1",goods));
    }

}