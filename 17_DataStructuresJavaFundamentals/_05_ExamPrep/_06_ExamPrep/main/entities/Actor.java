package entities;

import java.util.Objects;

public class Actor {
    private String id;
    private String name;
    private int age;
    private double maxMovieBudget = 0;

    public Actor(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public double getMaxMovieBudget() {
        return maxMovieBudget;
    }

    public Actor setMaxMovieBudget(double maxMovieBudget) {
        this.maxMovieBudget = maxMovieBudget;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        
        return age == actor.age && Double.compare(actor.maxMovieBudget, maxMovieBudget) == 0 && Objects.equals(id, actor.id) && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, maxMovieBudget);
    }
}
