import Hierarchy;
import IHierarchy;

public class HierarchyStructureInitializer {
    public static <T> IHierarchy<T> create(T root) {
        return new Hierarchy<>(root);
    }
}
