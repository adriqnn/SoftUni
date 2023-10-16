package _04_JavaOOP._01_WorkingWithAbstractionExercise._06_GreedyTimes;

public class Gem {
    private String name;
    private long value;

    public Gem(String name,long value) {
        this.name = name;
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("##%s - %d", this.name, this.value);
    }
}
