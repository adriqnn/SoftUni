package storageService.core;

import org.junit.Before;
import org.junit.Test;
import storageService.core.*;
import storageService.models.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test02 {
    private StorageService storageService;

    @Before
    public void setup() {
        storageService = new StorageServiceImpl();
    }

    @Test
    public void isStored() {
        verifyCorrectness();

        storageService = new StorageServiceImpl();

        for (int i = 0; i < 1000; i++) {
            storageService.rentStorage(new StorageUnit("single" + i, 1000 * i, 0));
        }

        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            Box current = new Box("" + i, 1, 1, (i + 1));
            boxes.add(current);
            storageService.storeBox(current);
        }


        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            storageService.isStored(boxes.get(i));
        }
        long stop = System.currentTimeMillis();

        assertTrue(stop - start < 10);

    }

    private void verifyCorrectness() {
        StorageUnit unit = new StorageUnit("first", 100, 1);
        storageService.rentStorage(unit);

        for (int i = 0; i < 70; i++) {
            Box current = new Box("" + i, 1, 1, 1);
            storageService.storeBox(current);
            assertTrue(storageService.isStored(current));
        }

        assertEquals(30, storageService.getTotalFreeSpace());
    }
}
