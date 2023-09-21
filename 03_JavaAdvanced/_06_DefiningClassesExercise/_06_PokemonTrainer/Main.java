package _03_JavaAdvanced._06_DefiningClassesExercise._06_PokemonTrainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        Map<String, Trainer> tournamentPlayers = new LinkedHashMap<>();

        while(!console.equals("Tournament")){
            String[] commandLine = console.split("\\s+");

            String trainerName = commandLine[0];
            String pokemonName = commandLine[1];
            String pokemonElement = commandLine[2];
            int pokemonHealth = Integer.parseInt(commandLine[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            tournamentPlayers.putIfAbsent(trainerName, new Trainer(trainerName));
            tournamentPlayers.get(trainerName).getAnimals().add(pokemon);

            // Other solution
            /*if(!tournamentPlayers.containsKey(trainerName)){
                Trainer trainer = new Trainer(trainerName);
                Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
                trainer.getAnimals().add(pokemon);
                tournamentPlayers.put(trainerName, trainer);
            }else{
                Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
                tournamentPlayers.get(trainerName).getAnimals().add(pokemon);
            }*/

            console = scan.nextLine();
        }

        String element = scan.nextLine();
        while(!element.equals("End")){
            for (String e : tournamentPlayers.keySet()) {
                boolean hasCounter = false;
                for (Pokemon p : tournamentPlayers.get(e).getAnimals()) {
                    String type = p.getElement();
                    if(element.equals(type) && p.getHealth() > 0){
                        int newBadges = tournamentPlayers.get(e).getNumberOfBadges() + 1;
                        tournamentPlayers.get(e).setNumberOfBadges(newBadges);
                        hasCounter = true;
                        break;
                    }
                }

                if(!hasCounter){
                    for (Pokemon p : tournamentPlayers.get(e).getAnimals()) {
                        p.setHealth(p.getHealth()-10);
                    }
                }
            }

            element = scan.nextLine();
        }

        tournamentPlayers.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().getNumberOfBadges(), e1.getValue().getNumberOfBadges())).forEach(e -> System.out.println(e.getValue()));

        scan.close();

        //tournamentPlayers.entrySet().stream().sorted((e1, e2) -> Integer.compare(e1.getValue().getNumberOfBadges(), e2.getValue().getNumberOfBadges())).forEach();
        //tournamentPlayers.entrySet().stream().sorted(Comparator.comparingInt(e -> e.getValue().getNumberOfBadges())).forEach(System.out::println);
        //forEach(e -> System.out.println(e.getValue()));
        /*tournamentPlayers.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().getNumberOfBadges(), e1.getValue().getNumberOfBadges())).forEach(e -> {
            int yep = 0;

            for (Pokemon p : e.getValue().getAnimals()) {
                if (p.getHealth() > 0){
                    yep++;
                }
            }

            System.out.println(String.format("%s %s %d", e.getKey(), e.getValue().getNumberOfBadges(), yep));
        });*/
    }
}
