package aquarium.entities.fish;

public class FreshwaterFish extends BaseFish{
    private static final int FRESHWATER_FISH_SIZE = 3;

    public FreshwaterFish(String name, String species, double price) {
        super(name, species, price);
        super.setSize(FRESHWATER_FISH_SIZE);
    }

    @Override
    public void eat() {
        super.setSize(super.getSize() + 3);
    }
}
