package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _10_LogsAggregator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputLines = Integer.parseInt(scan.nextLine());
        Map<String, List<String>> list = new TreeMap<>();

        for (int i = 0; i < inputLines; i++) {
            String[] information = scan.nextLine().split("\\s+");
            String ipAddress = information[0];
            String name = information[1];
            int session = Integer.parseInt(information[2]);

            if(!list.containsKey(name)){
                list.put(name, new ArrayList<>());
            }
            if(list.get(name).size() == 0){
                list.get(name).add(session + "");
                list.get(name).add(ipAddress);
            }else{
                int setSession = Integer.parseInt(list.get(name).get(0)) + session;
                list.get(name).set(0, setSession + "");
                list.get(name).add(ipAddress);
            }
        }

        list.entrySet().forEach(e -> {
            String first = e.getKey();
            String second = e.getValue().get(0);
            Set<String> ips = new TreeSet<>();
            for (int i = 1; i < e.getValue().size(); i++) {
                ips.add(e.getValue().get(i));
            }
            String third = String.format("[%s]", String.join(", ", ips));

            System.out.printf("%s: %s %s%n",first,second,third);
        });
    }
}
