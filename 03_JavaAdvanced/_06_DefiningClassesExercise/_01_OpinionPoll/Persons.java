package _03_JavaAdvanced._06_DefiningClassesExercise._01_OpinionPoll;

public class Persons {
    private String person;
    private int age;
    
    public Persons(String person, int age) {
        this.person = person;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getPerson() {
        return person;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %d",this.person,this.age);
    }
}
