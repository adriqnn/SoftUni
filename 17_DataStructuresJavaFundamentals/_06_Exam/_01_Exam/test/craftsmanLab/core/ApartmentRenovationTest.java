package craftsmanLab.core;

import craftsmanLab.models.ApartmentRenovation;
import craftsmanLab.models.Craftsman;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class ApartmentRenovationTest {
    private CraftsmanLab lab;

    private final Craftsman craftsman1 = new Craftsman("Bai Pesho", 100, 0);
    private final Craftsman craftsman2 = new Craftsman("Bai Gosho", 10, 950);

    private final ApartmentRenovation apart1 = new ApartmentRenovation("plovdi1", 100, 10, LocalDate.now());
    private final ApartmentRenovation apart2 = new ApartmentRenovation("plovdi2", 100, 10, LocalDate.now());
    private final ApartmentRenovation apart3 = new ApartmentRenovation("plovdi3", 100, 10, LocalDate.now());

    @Before
    public void setup() {
        this.lab = new CraftsmanLabImpl();
    }

    @Test
    public void assignRenovationsAssignCorrectWorkers() {
        lab.addCraftsman(craftsman1);
        lab.addCraftsman(craftsman2);

        lab.addApartment(apart1);
        lab.addApartment(apart2);
        lab.addApartment(apart3);

        lab.assignRenovations();

        assertEquals(lab.getContractor(apart1), craftsman1);
        assertEquals(lab.getContractor(apart2), craftsman2);
        assertEquals(lab.getContractor(apart3), craftsman1);
    }
}
