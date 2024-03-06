package storageService.core;


import storageService.models.Box;
import storageService.models.StorageUnit;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StorageServiceImpl implements StorageService {
    Map<String, StorageUnit> storages;
    Map<String, Box> boxes;

    public StorageServiceImpl() {
        this.storages = new LinkedHashMap<>();
        this.boxes = new LinkedHashMap<>();
    }

    @Override
    public void rentStorage(StorageUnit unit) {
        if(this.storages.containsKey(unit.id)){
            throw new IllegalArgumentException();
        }

        this.storages.put(unit.id, unit);
    }

    @Override
    public void storeBox(Box box) {
        if(this.boxes.containsKey(box.id)){
            throw new IllegalArgumentException();
        }

        if(this.storages.isEmpty()){
            throw new IllegalArgumentException();
        }

        StorageUnit mostAvailableSpaceUnit = this.getMostAvailableSpaceUnit();

        if(mostAvailableSpaceUnit.mySpaceMethod() < box.volume()){
            throw new IllegalArgumentException();
        }

        box.setStorageUnit(mostAvailableSpaceUnit);
        mostAvailableSpaceUnit.setTotalUsedSpace((int) (mostAvailableSpaceUnit.getTotalUsedSpace() + box.volume()));
        mostAvailableSpaceUnit.getBoxes().add(box);

        this.boxes.put(box.id, box);
    }

    @Override
    public boolean isStored(Box box) {
        return this.boxes.containsKey(box.id);
    }

    @Override
    public boolean isRented(StorageUnit unit) {
        return this.storages.containsKey(unit.id);
    }

    @Override
    public boolean contains(StorageUnit unit, String boxId) {
        if(!this.boxes.containsKey(boxId)){
            return false;
        }

        return this.boxes.get(boxId).getStorageUnit().getId().equals(unit.id);
    }

    @Override
    public Box retrieve(StorageUnit unit, String boxId) {
        if(!this.storages.containsKey(unit.getId())){
            throw new IllegalArgumentException();
        }

        if(!this.boxes.containsKey(boxId)){
            throw new IllegalArgumentException();
        }

        if(!this.boxes.get(boxId).getStorageUnit().getId().equals(unit.id)){
            throw new IllegalArgumentException();
        }

        if(this.boxes.get(boxId).getStorageUnit().getId().equals(unit.id)){
            StorageUnit storageUnit = this.storages.get(unit.id);
            storageUnit.getBoxes().remove(this.boxes.get(boxId));
            storageUnit.setTotalUsedSpace((int) (storageUnit.getTotalUsedSpace() - this.boxes.get(boxId).volume()));
        }else{
            throw new IllegalArgumentException();
        }

        return this.boxes.remove(boxId);
    }

    @Override
    public int getTotalFreeSpace() {
        int totalFreeSpace = 0;

        for (StorageUnit value : this.storages.values()) {
            int i = value.mySpaceMethod();
            totalFreeSpace += i;
        }

        return totalFreeSpace;
    }

    @Override
    public StorageUnit getMostAvailableSpaceUnit() {
        if(this.storages.isEmpty()){
            throw new IllegalArgumentException();
        }

        return this.storages.values()
                .stream().sorted(Comparator.comparing(StorageUnit::mySpaceMethod).reversed()).collect(Collectors.toList()).get(0);
    }

    @Override
    public Collection<Box> getAllBoxesByVolume() {
        return this.boxes.values().stream().sorted((b1, b2) -> {
            int compare = Double.compare(b1.volume(), b2.volume());

            if(compare == 0){
                compare = Integer.compare(b2.getHeight(), b1.getHeight());
            }

            return compare;
        }).collect(Collectors.toList());
    }

    @Override
    public Collection<StorageUnit> getAllUnitsByFillRate() {
        return this.storages.values().stream().sorted((s1, s2) -> {
            int percentS1 = s1.mySpaceMethod() / s1.getTotalAvailableSpace();
            int percentS2 = s2.mySpaceMethod() / s2.getTotalAvailableSpace();

            int compare = Integer.compare(percentS2, percentS1);

            if(compare == 0){
                compare = Integer.compare(s2.getTotalAvailableSpace(), s1.getTotalAvailableSpace());
            }

            return compare;
        }).collect(Collectors.toList());
    }
}
