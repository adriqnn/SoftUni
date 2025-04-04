package _04_JavaOOP._05_PolymorphismExercise._03_WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String animalInput = scan.nextLine();
        
        List<Animal> animals = new ArrayList<>();
        
        while (!animalInput.equals("End")) {
            String[] tokens = animalInput.split(" ");
            Animal animal = createAnimal(tokens);
            
            String foodInput = scan.nextLine();
            Food food = getFood(foodInput.split(" "));

            animal.makeSound();
            
            try{
                animal.eat(food);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            animals.add(animal);
            animalInput = scan.nextLine();
        }

        animals.forEach(System.out::println);

        scan.close();
    }

    public static Food getFood(String[] tokens){
        String type = tokens[0];
        int quantity = Integer.parseInt(tokens[1]);

        if(type.equals("Meat")){
            return new Meat(quantity);
        } else {
            return new Vegetable(quantity);
        }
    }

    public static Animal createAnimal(String[] tokens){
        String animalType = tokens[0];
        String animalName = tokens[1];
        double animalWeight = Double.parseDouble(tokens[2]);
        String animalLivingRegion = tokens[3];
        
        switch (animalType){
            case "Mouse":
                return new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
            case "Cat":
                return new Cat(animalName, animalType, animalWeight, animalLivingRegion, tokens[4]);
            case "Zebra":
                return new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
            case "Tiger":
                return new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
            default:
                throw new IllegalArgumentException("No such animal");
        }
    }
}
