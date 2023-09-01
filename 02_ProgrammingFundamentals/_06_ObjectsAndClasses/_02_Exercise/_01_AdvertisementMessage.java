package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class _01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        List<String> one = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product.");
        List<String> two = Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now i feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> three = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> four = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");
        
        // Generate and print randomized advertisement message
        for (int i = 0; i < n; i++) {
            Random randomFromList = new Random();
            
            int randomOne = randomFromList.nextInt(one.size());
            String first = one.get(randomOne);
            
            int randomTwo = randomFromList.nextInt(two.size());
            String second = two.get(randomTwo);
            
            int randomThree = randomFromList.nextInt(one.size());
            String third = three.get(randomThree);
            
            int randomFour = randomFromList.nextInt(four.size());
            String fourth = four.get(randomFour);
            
            System.out.printf("%s %s %s - %s%n", first, second, third, fourth);
        }
        
        scan.close();
    }
}
