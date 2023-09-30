package _03_JavaAdvanced._06_DefiningClassesExercise._07_Google;

public class Children {
    private String name;
    private String date;

    public Children(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return this.name + " " + this.date;
    }
}
