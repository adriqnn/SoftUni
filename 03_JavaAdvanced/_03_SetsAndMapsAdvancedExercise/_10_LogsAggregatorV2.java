package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _10_LogsAggregatorV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read input value
        int inputLines = Integer.parseInt(reader.readLine());

        // Add variable
        Map<String, List<String>> list = new TreeMap<>();

        // Create logs aggregator
        for (int i = 0; i < inputLines; i++) {
            String[] information = reader.readLine().split("\\s+");

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

        // Print result
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

        reader.close();
    }
}
