package mlm.core;

import mlm.core.*;
import mlm.models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class test001 {
    private MLMService service;
    private Seller seller = new Seller("first");

    @Before
    public void setup() {
        service = new MLMServiceImpl();
    }

    @Test
    public void makeSale() {
        verifyCorrectness();

        service = new MLMServiceImpl();

        Seller oldParent = seller;
        service.addSeller(seller);
        List<Seller> sellerList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            Seller newHire = new Seller("seller " + i);
            sellerList.add(newHire);

            service.hireSeller(oldParent, newHire);

            oldParent = newHire;
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            service.makeSale(sellerList.get(i), 5_000_000);
        }
        long stop = System.currentTimeMillis();

        assertTrue( stop - start < 6500);
    }

    private void verifyCorrectness() {
        for (int i = 0; i < 100; i++) {
            Seller current = new Seller("seller " + i);
            service.addSeller(current);
            assertTrue(service.exists(current));
        }

        service.addSeller(seller);

        Seller second = new Seller("second");
        service.hireSeller(seller, second);

        assertTrue(service.exists(seller));
        assertTrue(service.exists(second));

        service.fire(seller);
        assertFalse(service.exists(seller));

        service.hireSeller(second, seller);

        service.makeSale(seller, 100);

        assertEquals(95, seller.earnings);
    }

}
