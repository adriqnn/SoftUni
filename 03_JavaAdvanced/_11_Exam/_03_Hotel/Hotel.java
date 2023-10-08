package _03_JavaAdvanced._11_Exam._03_Hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public String name;
    public int capacity;
    public List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person){
        if(this.capacity > this.roster.size()){
            this.roster.add(person);
        }
    }

    public boolean remove(String name){
        for (Person p : roster) {
            if(p.getName().equals(name)){
                this.roster.remove(p);
                return true;
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown){
        return this.roster.stream().filter(p -> p.getName().equals(name) && p.getHometown().equals(hometown)).findAny().orElse(null);
    }

    public int getCount(){
        return this.roster.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The people in the hotel ").append(this.name).append(" are:").append(System.lineSeparator());
        for (Person p : roster) {
            sb.append(p).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
