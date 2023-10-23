package _04_JavaOOP._04_InterfacesAndAbstractionExercise._07_CollectionHierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private int maxSize;
    private List<String> items;

    public Collection() {
        this.maxSize = 100;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public List<String> getItems() {
        return this.items;
    }
}
