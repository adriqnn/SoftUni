package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String phone = scan.nextLine();

        // Add variable
        Map<String, String> phonebook = new HashMap<>();

        // Make phonebook record
        while(!phone.equals("search")){
            String name = phone.split("-")[0];
            String number = phone.split("-")[1];
            
            phonebook.put(name, number);
            
            phone = scan.nextLine();
        }

        String search = scan.nextLine();
        
        // Determine if the entry is in the phonebook
        while(!search.equals("stop")){
            if(phonebook.containsKey(search)){
                System.out.println(search + " -> " + phonebook.get(search));
            }else{
                System.out.println("Contact " + search + " does not exist.");
            }
            
            search = scan.nextLine();
        }
        
        scan.close();
    }
}
