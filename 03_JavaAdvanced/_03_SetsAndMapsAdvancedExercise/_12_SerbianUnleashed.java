package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _12_SerbianUnleashed {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variable
        LinkedHashMap<String, LinkedHashMap<String, Integer>> concerts = new LinkedHashMap<>();

        // Make a concerts list
        while(!input.equals("End")) {
            if(!input.contains("@") || input.charAt(input.indexOf("@") - 1) != ' '){
                input = scan.nextLine();
                continue;
            }

            String singer = input.substring(0, input.indexOf("@") - 1);
            int firstIndexOfNumber = 0;

            for (int i = input.indexOf("@"); i < input.length(); i++) {
                char currentSymbol = input.charAt(i);
                if(Character.isDigit(currentSymbol) && input.charAt(i - 1) == ' '){
                    firstIndexOfNumber = i;
                    break;
                }
            }

            if(firstIndexOfNumber == 0) {
                input = scan.nextLine();
                continue;
            }

            String venue = input.substring(input.indexOf("@") + 1, firstIndexOfNumber - 1);
            String numbers = input.substring(firstIndexOfNumber);//"25 3000"
            String [] numbersArray = numbers.split("\\s+");

            if(numbersArray.length != 2) {
                input = scan.nextLine();
                continue;
            }

            int price = Integer.parseInt(numbersArray[0]);
            int capacity = Integer.parseInt(numbersArray[1]);

            if (!concerts.containsKey(venue)) {
                LinkedHashMap<String, Integer> singers = new LinkedHashMap<>();
                singers.put(singer, price * capacity);
                concerts.put(venue, singers);
            } else {
                LinkedHashMap<String, Integer> currentSingers = concerts.get(venue);
                if (currentSingers.containsKey(singer)) {
                    currentSingers.put(singer, currentSingers.get(singer) + price * capacity);
                } else {
                    currentSingers.put(singer, price * capacity);
                }

                concerts.put(venue, currentSingers);
            }
            
            input = scan.nextLine();
        }

        // Print result
        for (String venue : concerts.keySet()) {
            System.out.println(venue);

            LinkedHashMap<String, Integer> singers = concerts.get(venue);
            singers.entrySet().stream().sorted((singer1, singer2) -> singer2.getValue().compareTo(singer1.getValue()))
                    .forEach(singer -> System.out.println(String.format("#  %s -> %d", singer.getKey(), singer.getValue())));
        }

        scan.close();
    }
}

