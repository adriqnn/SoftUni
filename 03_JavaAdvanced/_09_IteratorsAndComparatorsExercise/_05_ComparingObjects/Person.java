package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._05_ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTown() {
        return town;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person otherPerson) {
        if(this.getName().compareTo(otherPerson.getName()) == 0){
            if(this.getAge() == otherPerson.getAge()){
                return this.getTown().compareTo(otherPerson.getTown());
            }
            return Integer.compare(this.getAge(),otherPerson.getAge());
        }
        return this.getName().compareTo(otherPerson.getName());
    }
}
