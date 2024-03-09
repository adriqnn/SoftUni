package helpers;

import org.junit.Before;

import IHierarchy;
import HierarchyStructureInitializer;

public class BaseTest {
    protected static final int DefaultRootValue = 5;
    protected IHierarchy<Integer> Hierarchy;

    @Before
    public void setUp() {
        this.Hierarchy = HierarchyStructureInitializer.create(DefaultRootValue);
    }
}
