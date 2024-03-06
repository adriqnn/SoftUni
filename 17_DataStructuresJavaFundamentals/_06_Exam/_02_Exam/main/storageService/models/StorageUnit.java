package storageService.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StorageUnit {
    public String id;
    public int totalAvailableSpace;
    public int totalUsedSpace;
    public List<Box> boxes;

    public StorageUnit(String id, int totalAvailableSpace, int totalUsedSpace) {
        this.id = id;
        this.totalAvailableSpace = totalAvailableSpace;
        this.totalUsedSpace = 0;
        this.boxes = new ArrayList<>();
    }

    public int mySpaceMethod(){
        return this.getTotalAvailableSpace() - this.getTotalUsedSpace();
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public StorageUnit setBoxes(List<Box> boxes) {
        this.boxes = boxes;
        return this;
    }

    public String getId() {
        return id;
    }

    public StorageUnit setId(String id) {
        this.id = id;
        return this;
    }

    public int getTotalAvailableSpace() {
        return totalAvailableSpace;
    }

    public StorageUnit setTotalAvailableSpace(int totalAvailableSpace) {
        this.totalAvailableSpace = totalAvailableSpace;
        return this;
    }

    public int getTotalUsedSpace() {
        return totalUsedSpace;
    }

    public StorageUnit setTotalUsedSpace(int totalUsedSpace) {
        this.totalUsedSpace = totalUsedSpace;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        StorageUnit that = (StorageUnit) o;
        
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
