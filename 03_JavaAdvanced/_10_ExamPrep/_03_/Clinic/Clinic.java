package _03_JavaAdvanced._10_ExamPrep._03_.Clinic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){
        if(this.capacity > this.data.size()){
            this.data.add(pet);
        }
    }

    public boolean remove(String name){
        for (Pet p : this.data) {
            if(p.getName().equals(name)){
                this.data.remove(p);
                return true;
            }
        }
        
        return false;
    }

    public Pet getPet(String name, String owner){
        return this.data.stream().filter(p -> p.getName().equals(name) && p.getOwner().equals(owner)).findAny().orElse(null);
    }

    public Pet getOldestPet(){
        return this.data.stream().sorted((a, b) -> Integer.compare(b.getAge(), a.getAge())).collect(Collectors.toList()).get(0);
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("The clinic has the following patients:").append(System.lineSeparator());
        for (Pet pet : this.data) {
            sb.append(String.format("%s %s", pet.getName(), pet.getOwner()));
            sb.append(System.lineSeparator());
        }
        
        return sb.toString();
    }
}
