package _03_JavaAdvanced._11_Exam._03_Hotel;

public class Person {
    private String name;
    private int id;
    private int age;
    private String hometown;

    public Person(String name, int id, int age, String hometown) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.hometown = hometown;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public String getHometown() {
        return this.hometown;
    }

    public String toString(){
        return String.format("Person %s: %d, Age: %d, Hometown: %s", this.name, this.id, this.age, this.hometown);
    }
}
