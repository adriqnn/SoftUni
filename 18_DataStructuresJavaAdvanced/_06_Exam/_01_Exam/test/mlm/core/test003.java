package mlm.core;

import mlm.core.*;
import mlm.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test003 {
    private MLMService service;

    private Seller seller = new Seller("first");

    @Before
    public void setup() {
        service = new MLMServiceImpl();
    }

    @Test
    public void makeSaleWithoutParents() {
        service.addSeller(seller);

        service.makeSale(seller, 100);

        assertEquals(100, seller.earnings);
    }
}

