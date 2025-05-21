package _02_ProgrammingFundamentals._11_RegularExpressions._02_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class _02_Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        List<String> racers = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());
        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        racers.forEach(racer -> racersDistance.put(racer, 0));

        String regexLetters = "[A-Za-z]{1}";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDistance = "[0-9]";
        Pattern patternNumbers = Pattern.compile(regexDistance);

        // Determine the winner of the race
        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();

            int distance = 0;
            Matcher matcherName = patternLetters.matcher(input);

            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }

            Matcher matcherDistance = patternNumbers.matcher(input);

            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String racerName = nameBuilder.toString();

            if (racersDistance.containsKey(racerName)) {
                int currentDistance = racersDistance.get(racerName);
                racersDistance.put(racerName, currentDistance + distance);
            }

            input = scan.nextLine();
        }

        /* List<String> firstThreeNames = racersDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList()); */

        Map<String, Integer> sortedMap = racersDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));
        List<String> firstThreeNames = new ArrayList<>();
        sortedMap.entrySet().forEach(entry -> firstThreeNames.add(entry.getKey()));

        // racersDistance = racersDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap());
        // sorted(entry2.getValue, entry1.getValue)
        // racerDistance.entrySet().stream().sorted(e1, e2 -> e2.getValue().compareTo(getValue(e1))

        // Print result
        System.out.println("1st place: " + firstThreeNames.get(0));
        System.out.println("2nd place: " + firstThreeNames.get(1));
        System.out.println("3rd place: " + firstThreeNames.get(2));

        scan.close();
    }
}
