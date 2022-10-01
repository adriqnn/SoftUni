package _03_JavaAdvanced._10_ExamPrep._03_.Rabbits;

public class Rabbit {
    private String name;
    private String species;
    private boolean available;

    public Rabbit(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setAvailable() {
        this.available = false;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return String.format("Rabbit (%s): %s", this.getSpecies(), this.getName());
    }
}
