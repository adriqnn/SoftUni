package aquarium.entities.fish;

import aquarium.common.ExceptionMessages;

public abstract class BaseFish implements Fish{
    private String name;
    private String species;
    private int size;
    private double price;

    protected BaseFish(String name, String species, double price) {
        setName(name);
        setSpecies(species);
        setPrice(price);
    }

    private void setSpecies(String species) {
        if(species == null || species.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.SPECIES_NAME_NULL_OR_EMPTY);
        }

        this.species = species;
    }

    private void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException(ExceptionMessages.FISH_PRICE_BELOW_OR_EQUAL_ZERO);
        }

        this.price = price;
    }

    @Override
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.FISH_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public void eat() {
        this.size += 5;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
