package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        Map<String, String> emailList = new LinkedHashMap<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        // Record names/emails
        while(!console.equals("stop")){
            queue.offer(console);
            console = scan.nextLine();
        }

        // Organize the dataset
        while(!queue.isEmpty()){
            String name = queue.poll();
            String email = queue.poll();
            
            if (!email.toLowerCase().endsWith("us") && !email.toLowerCase().endsWith("uk") && !email.toLowerCase().endsWith("com")){
                emailList.put(name, email);
            }
        }

        // Print result
        emailList.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        scan.close();
    }
}
