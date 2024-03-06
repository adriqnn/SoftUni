package storageService.core;
import org.junit.Before;
import org.junit.Test;
import storageService.core.*;
import storageService.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test01 {

    private StorageService storageService;

    @Before
    public void setup() {
        storageService = new StorageServiceImpl();
    }

    @Test
    public void getMostAvailableSpaceUnit() {
        verifyCorrectness();

        storageService = new StorageServiceImpl();

        for (int i = 0; i < 10000; i++) {
            StorageUnit unit = new StorageUnit("only" + i, 100, 0);
            storageService.rentStorage(unit);
        }

        for (int i = 0; i < 4000; i++) {
            Box box = new Box("" + i, (i + 1) % 4, 4, 4);
            storageService.storeBox(box);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            storageService.getMostAvailableSpaceUnit();
        }
        long stop = System.currentTimeMillis();

        assertTrue(stop - start < 10);

    }

    private void verifyCorrectness() {
        StorageUnit unit = new StorageUnit("first", 100, 1);
        storageService.rentStorage(unit);
        StorageUnit second = new StorageUnit("second", 40, 1);
        storageService.rentStorage(second);

        Box box = new Box("single", 1, 10, 8);
        storageService.storeBox(box);

        StorageUnit mostAvailableSpaceUnit = storageService.getMostAvailableSpaceUnit();

        assertEquals(second, mostAvailableSpaceUnit);
    }
}
