package _03_JavaAdvanced._06_DefiningClassesExercise._07_Google;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Person {
    private String name; //unique
    private Company company; //unique
    private Map<String, List<Pokemon>> pokemon; //multiple
    private Map<String, List<Parents>> parents; //multiple
    private Map<String, List<Children>> children; //multiple
    private Car car; //unique

    public Person(String name) {
        this.name = name;
        this.company = new Company("","","");
        this.pokemon = new LinkedHashMap<>();
        this.parents = new LinkedHashMap<>();
        this.children = new LinkedHashMap<>();
        this.car = new Car("","");
    }

    public String getName() {
        return this.name;
    }

    public Company getCompany() {
        return this.company;
    }

    public Map<String, List<Pokemon>> getPokemon() {
        return this.pokemon;
    }

    public Map<String, List<Parents>>getParents() {
        return this.parents;
    }

    public Map<String, List<Children>> getChildren() {
        return this.children;
    }

    public Car getCar() {
        return this.car;
    }

    @Override
    public String toString(){
        String nameString = this.name + "\n";
        String companyString = this.company.toString();
        String carString = this.car.toString();

        return nameString + companyString + carString;
    }
}
