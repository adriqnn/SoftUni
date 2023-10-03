package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._05_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Person> people = new ArrayList<>();

        while(!input.equals("END")){
            String[] peopleParameters = input.split("\\s+");

            String name = peopleParameters[0];
            int age = Integer.parseInt(peopleParameters[1]);
            String town = peopleParameters[2];

            Person person = new Person(name, age, town);
            people.add(person);

            input = scan.nextLine();
        }

        int comparePerson = Integer.parseInt(scan.nextLine());
        int size = people.size();
        
        Person personToCompare = people.remove(comparePerson - 1);
        
        int samePeople = 0;
        int differentPeople = 0;
        
        for (Person person : people) {
            if(person.compareTo(personToCompare) == 0){
                samePeople++;
            }else{
                differentPeople++;
            }
        }
        
        if(samePeople == 0){
            System.out.println("No matches");
        }else{
            System.out.printf("%d %d %d",++samePeople,differentPeople,size);
        }
    }
}
