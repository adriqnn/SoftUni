package _03_JavaAdvanced._06_DefiningClassesExercise._01_OpinionPoll;

public class Person {
    private String person;
    private int age;

    public Person(String person, int age) {
        this.person = person;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getPerson() {
        return this.person;
    }

    @Override
    public String toString(){
        return String.format("%s - %d", this.person, this.age);
    }
}
