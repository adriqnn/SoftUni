package _04_JavaOOP._03_InheritanceExercise._06_Animals;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound(){
        return "Woof!";
    }
}