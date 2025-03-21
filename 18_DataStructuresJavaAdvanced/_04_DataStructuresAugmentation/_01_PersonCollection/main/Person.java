import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String email;
    private int age;
    private String town;

    public Person() {
        super();
    }

    public Person(String email, String name, int age, String town) {
        this.setName(name);
        this.setEmail(email);
        this.setAge(age);
        this.setTown(town);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return this.town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int compareTo(Person o) {
        return this.getEmail().compareTo(o.getEmail());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;

        return age == person.age && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(town, person.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, age, town);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", age=" + age + ", town='" + town + '\'' + '}';
    }
}