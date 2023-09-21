package _03_JavaAdvanced._06_DefiningClassesExercise._07_Google;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        Map<String, Person> information = new LinkedHashMap<>();

        while(!console.equals("End")){
            String[] commandLine = console.split("\\s+");

            String name = commandLine[0];
            String nr1 = commandLine[1];
            String nr2 = commandLine[2];
            String nr3 = commandLine[3];
            String nr4 = "";

            try{
                nr4 = commandLine[4];
            }catch(Exception e){
                nr4 = "";
            }

            information.putIfAbsent(name, new Person(name));
            
            if (nr1.equals("company")){
                
                information.get(name).getCompany().setName(nr2);
                information.get(name).getCompany().setDepartment(nr3);
                information.get(name).getCompany().setSalary(nr4);
                
            }else if(nr1.equals("pokemon")){
                
                information.get(name).getPokemon().putIfAbsent(name,new ArrayList<>());
                information.get(name).getPokemon().get(name).add(new Pokemon(nr2, nr3));
                
            }else if(nr1.equals("parents")){
                
                information.get(name).getParents().putIfAbsent(name,new ArrayList<>());
                information.get(name).getParents().get(name).add(new Parents(nr2, nr3));
                
            }else if(nr1.equals("children")){
                
                information.get(name).getChildren().putIfAbsent(name,new ArrayList<>());
                information.get(name).getChildren().get(name).add(new Children(nr2, nr3));
                
            }else if(nr1.equals("car")){
                information.get(name).getCar().setModel(nr2);
                information.get(name).getCar().setSpeed(nr3);
            }
            
            console = scan.nextLine();
        }
        
        String print = scan.nextLine();
        
        System.out.print(information.get(print));
        System.out.println("Pokemon:");
        information.get(print).getPokemon().forEach((key, value) -> value.forEach(System.out::println));
        System.out.println(("Parents:"));
        information.get(print).getParents().forEach((key, value) -> value.forEach(System.out::println));
        System.out.println("Children:");
        information.get(print).getChildren().forEach((key, value) -> value.forEach(System.out::println));

        /*String pokemon3 = pokemon.entrySet().forEach(e -> String.join(System.,S));
        String parents4 = this.parents.toString();
        String children5 = this.children.toString();*/

        scan.close();
    }
}
