package _02_ProgrammingFundamentals._13_Exam;

import java.util.*;

public class _03_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();
        
        // Add variables
        Map<String, List<String>> guestLikes = new TreeMap<>();
        Map<String, List<String>> guestUnlike = new HashMap<>();
        
        int unlikedMeals = 0;
        
        // Make statistics for likes and dislikes
        while (!console.equals("Stop")) {
            String[] commandLine = console.split("-");
            
            String command = commandLine[0];
            String guestName = commandLine[1];
            String mealName = commandLine[2];
            
            switch (command) {
                case "Like":
                    if (!guestLikes.containsKey(guestName)) {
                        guestLikes.put(guestName, new ArrayList<>());
                    }
                    
                    if (!guestLikes.get(guestName).contains(mealName)) {
                        guestLikes.get(guestName).add(mealName);
                    }
                    
                    break;
                case "Unlike":
                    if (!guestLikes.containsKey(guestName)) {
                        System.out.printf("%s is not at the party.%n", guestName);
                        console = scan.nextLine();
                        continue;
                    }
                    
                    if (guestLikes.get(guestName).contains(mealName)) {
                        guestLikes.get(guestName).remove(mealName);
                        
                        System.out.printf("%s doesn't like the %s.%n", guestName, mealName);
                        unlikedMeals++;
                    } else {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, mealName);
                    }
                    
                    break;
            }
            
            console = scan.nextLine();
        }
        
        // Print result
        guestLikes.entrySet().stream().sorted((m1, m2) -> Integer.compare(m2.getValue().size(), m1.getValue().size())).forEach(guest -> {
            System.out.print(guest.getKey() + ": ");
            System.out.print(guest.getValue().toString().replace("[", "").replace("]", ""));
            System.out.println();
        });
        
        System.out.printf("Unliked meals: %d", unlikedMeals);
        
        scan.close();
    }
}

/*
    carsMileage.entrySet().stream().sorted((car1, car2) -> Integer.compare(car2.getValue(), car1.getValue())).forEach(carEntry -> {
        String carName = carEntry.getKey();
        System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", carEntry.getKey(), carEntry.getValue(), carsFuel.get(carName));
    });
 */

/*
    courses.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).forEach(entry -> {
        System.out.println(entry.getKey() + ": " + entry.getValue().size());
        // entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));});
        List<String> students = entry.getValue();
        students.stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
    });
*/
