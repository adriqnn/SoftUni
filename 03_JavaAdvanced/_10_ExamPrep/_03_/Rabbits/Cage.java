package _03_JavaAdvanced._10_ExamPrep._03_.Rabbits;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cage {
    private String name;
    private int capacity;
    private Map<String, Rabbit> data;
    private int takenSpots;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new LinkedHashMap<>();
        this.takenSpots = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Rabbit rabbit){
        if(this.data.size() < this.capacity){
            this.data.putIfAbsent(rabbit.getName(), rabbit);
        }
    }

    public boolean removeRabbit(String name){
        boolean contains = this.data.containsKey(name);

        if(contains){
            this.data.remove(name);
        }

        return contains;
    }

    public void removeSpecies(String species){
        for (Map.Entry<String, Rabbit> r : this.data.entrySet()) {
            if(r.getValue().getSpecies().equals(species)){
                this.data.remove(r.getKey());
            }
        }
    }

    public Rabbit sellRabbit(String name){
        Rabbit r = null;

        if(this.data.containsKey(name)) {
            r = this.data.get(name);
            this.data.get(name).setAvailable();
        }

        return  r;
    }

    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> returnRabbitList = this.data.values().stream().filter(e -> e.getSpecies().equals(species)).collect(Collectors.toList());
        this.data.entrySet().removeIf(e -> e.getValue().getSpecies().equals(species));
        
        return returnRabbitList;
    }

    public int count(){
        return this.data.size();
    }

    public String report(){
        String values = this.data.values().stream().filter(Rabbit::isAvailable).map(Rabbit::toString).collect(Collectors.joining(System.lineSeparator()));

        return String.format("Rabbits available at %s:%n%s", this.name, values);
    }
}
