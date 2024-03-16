package mlm.core;

import mlm.core.*;
import mlm.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test002 {
    private MLMService service;
    private Seller seller = new Seller("first");

    @Before
    public void setup() {
        service = new MLMServiceImpl();
    }

    @Test
    public void hireSeller() {
        verifyCorrectness();

        service = new MLMServiceImpl();

        Seller oldParent = seller;
        service.addSeller(seller);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Seller newHire = new Seller("seller " + i);
            service.hireSeller(oldParent, newHire);

            oldParent = newHire;
        }
        long stop = System.currentTimeMillis();

        assertTrue( stop - start < 350);
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
    }
}
