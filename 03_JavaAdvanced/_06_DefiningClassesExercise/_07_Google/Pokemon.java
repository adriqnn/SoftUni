package _03_JavaAdvanced._06_DefiningClassesExercise._07_Google;

public class Pokemon {
    private String name;
    private String type;
    
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.type;
    }
}
