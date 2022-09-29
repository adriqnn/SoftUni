package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _10_PredicateParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> invited = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayList::new));

        String console = scan.nextLine();
        while(!console.equals("Party!")){
            Predicate<String> predicate = null;
            String[] commandLine = console.split("\\s+");
            String first = commandLine[0];
            String second = commandLine[1];
            String third = commandLine[2];
            if(console.contains("Length")){
                predicate = x -> x.length() == Integer.parseInt(third);
            }else if(console.contains("StartsWith")){
                predicate = x -> x.startsWith(third);
            }else{
                predicate = x -> x.endsWith(third);
            }
            if(console.contains("Remove")){
                ArrayList<String> toRemove = new ArrayList<>();
                for (String guest : invited) {
                    if(predicate.test(guest)){
                        toRemove.add(guest);
                    }
                }
                invited.removeAll(toRemove);
            }else{
                ArrayList<String> toAdd = new ArrayList<>();
                for (String guest : invited) {
                    if(predicate.test(guest)){
                        toAdd.add(guest);
                    }
                }
                invited.addAll(toAdd);
            }
            console = scan.nextLine();
        }
        if(invited.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else{
            System.out.println(invited.stream().sorted().collect(Collectors.toCollection(ArrayList::new)).toString().replaceAll("([\\[\\]])","") + " are going to the party!");
        }
    }
}
