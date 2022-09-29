package _03_JavaAdvanced._05_FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _11_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> guests = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        String console = scan.nextLine();
        HashMap<String, Predicate> predicates = new HashMap<>();
        while(!console.equals("Print")){
            String[] commandLine = console.split(";");

            if(console.contains("Add")){
                Predicate<String> predicate = null;
                if(console.contains("Starts with")){
                    predicate = x -> x.startsWith(commandLine[2]);
                    predicates.putIfAbsent(commandLine[1]+commandLine[2], predicate);
                }else if(console.contains("Ends with")){
                    predicate = x -> x.endsWith(commandLine[2]);
                    predicates.putIfAbsent(commandLine[1]+commandLine[2], predicate);
                }else if(console.contains("Length")){
                    predicate = x -> x.length() == Integer.parseInt(commandLine[2]);
                    predicates.putIfAbsent(commandLine[1]+commandLine[2], predicate);
                }else if (console.contains("Contains")){
                    predicate = x -> x.contains(commandLine[2]);
                    predicates.putIfAbsent(commandLine[1]+commandLine[2], predicate);
                }
            }else{
                predicates.remove(commandLine[1]+commandLine[2]);
            }
            console = scan.nextLine();
        }
        for (Map.Entry<String,Predicate> e : predicates.entrySet()) {
            ArrayList<String> toRemove = new ArrayList<>();
            for (String s: guests) {
                if (e.getValue().test(s)){
                    toRemove.add(s);
                }
            }
            guests.removeAll(toRemove);
        }
        System.out.println(guests.stream().collect(Collectors.joining(" ")));
        //System.out.print(String.join(" ", guests));
    }
}
