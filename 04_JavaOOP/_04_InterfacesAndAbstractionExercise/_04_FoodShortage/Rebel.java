package _04_JavaOOP._04_InterfacesAndAbstractionExercise._04_FoodShortage;

public class Rebel implements Person,Buyer{
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }

    public void setName(String name){
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public void buyFood() {
        this.food = this.food + 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getGroup() {
        return this.group;
    }
}
