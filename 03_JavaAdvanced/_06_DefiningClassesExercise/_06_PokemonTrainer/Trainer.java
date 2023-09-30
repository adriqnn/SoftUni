package _03_JavaAdvanced._06_DefiningClassesExercise._06_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> animals;

    public Trainer(String name){
        this.name = name;
        this.numberOfBadges = 0;
        this.animals = new ArrayList<>();
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }

    public List<Pokemon> getAnimals() {
        return this.animals;
    }

    public String getName() {
        return this.name;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public void setAnimals(List<Pokemon> animals) {
        this.animals = animals;
    }

    @Override
    public String toString(){
        int number = 0;

        for (int i = 0; i < this.animals.size(); i++) {
            if(this.animals.get(i).getHealth() > 0){
                number++;
            }
        }

        return this.name + " " + this.numberOfBadges + " " + number;
    }
}
