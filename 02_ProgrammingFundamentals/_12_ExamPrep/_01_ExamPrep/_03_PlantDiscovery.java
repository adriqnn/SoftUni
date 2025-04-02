package _02_ProgrammingFundamentals._12_ExamPrep._01_ExamPrep;

import java.util.*;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int plantNumber = Integer.parseInt(scan.nextLine());

        // Add variable
        Map<String, PlantData> currentPlants = new LinkedHashMap<>();

        // Add plants
        for (int i = 0; i < plantNumber; i++) {
            String plantText = scan.nextLine();

            String[] plantParts = plantText.split("<->");

            String plantName = plantParts[0];
            int plantRarity = Integer.parseInt(plantParts[1]);

            PlantData newPlant = new PlantData(new ArrayList<>(), plantRarity);
            currentPlants.put(plantName, newPlant);
        }

        String command = scan.nextLine();

        // Create plant data
        while (!command.equals("Exhibition")) {
            String[] commandParts = command.split(": | - ");

            String commandName = commandParts[0];
            String plantName = commandParts[1];

            if (!currentPlants.containsKey(plantName)) {
                command = scan.nextLine();
                System.out.println("error");
                continue;
            }

            switch (commandName) {
                case "Rate":
                    int rating = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).addRating(rating);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(commandParts[2]);
                    currentPlants.get(plantName).setRarity(rarity);
                    break;
                case "Reset":
                    currentPlants.get(plantName).removeAllRatings();
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            
            command = scan.nextLine();
        }

        // Print result
        System.out.println("Plants for the exhibition:");
        currentPlants.entrySet().stream().sorted((p1, p2) -> {
            int result = Integer.compare(p2.getValue().getRarity(), p1.getValue().getRarity());

            if (result == 0){
                result = Double.compare(p2.getValue().getAverageRating(), p1.getValue().getAverageRating());
            }

            return result;

        }).forEach(p -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", p.getKey(), p.getValue().getRarity(), p.getValue().getAverageRating()));

        scan.close();
    }
}

// Create practice PlantData class 
class PlantData{
    private List<Integer> ratings;
    private int rarity;

    public void addRating(int rating){
        this.ratings.add(rating);
    }

    public void removeAllRatings(){
        this.ratings.clear();
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getRarity() {
        return this.rarity;
    }

    public double getAverageRating(){
        double sumOfAllRatings = 0;

        for (Integer rating : this.ratings){
            sumOfAllRatings += rating;
        }

        if(sumOfAllRatings == 0){
            return 0;
        }else{
            return sumOfAllRatings / this.ratings.size();
        }
    }

    public PlantData(List<Integer> ratings, int rarity){
        this.rarity = rarity;
        this.ratings = ratings;
    }
}

