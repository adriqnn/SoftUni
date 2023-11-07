package a.aquarium;

public class Fish {
    private String name;
    private boolean available;

    public Fish(String name){
        this.setName(name);
        this.setAvailable(true);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
