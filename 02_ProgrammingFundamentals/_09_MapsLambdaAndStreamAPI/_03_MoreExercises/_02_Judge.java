package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._03_MoreExercises;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class _02_Judge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        Map<String, List<String>> contests = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> students = new HashMap<>();

        // Create student's score system and db
        while (!input.equals("no more time")) {
            String[] information = input.split(" -> ");
            
            String username = information[0];
            String contest = information[1];
            int points = Integer.parseInt(information[2]);

            if (!contests.containsKey(contest)) {
                contests.put(contest, new ArrayList<>());
            }

            if (!contests.get(contest).contains(username)) {
                contests.get(contest).add(username);
            }

            if (!students.containsKey(username)) {
                students.put(username, new HashMap<>());
                students.get(username).put(contest, points);
            } else {
                if (!students.get(username).containsKey(contest)) {
                    students.get(username).put(contest, points);
                } else {
                    int savedPoints = students.get(username).get(contest);
                    
                    if (savedPoints < points) {
                        students.get(username).put(contest, points);
                    }
                }
            }
            
            input = scan.nextLine();
        }


        String collect = contests.entrySet().stream().map(contest -> {
            String firstLine = String.format("%s: %d participants%n", contest.getKey(), contest.getValue().size());
            
            List<String> secondLine = new ArrayList<>();
            List<String> participants = contest.getValue();
            Map<String, Integer> participantsResults = new HashMap<>();

            participants.forEach(e -> {
                int points = students.get(e).get(contest.getKey());
                participantsResults.put(e, points);
            });

            List<Student> unorderedStudents = new ArrayList<>();
            participantsResults.entrySet().forEach(e -> {
                Student student = new Student(e.getKey(), e.getValue());
                unorderedStudents.add(student);
            });
            
            List<Student> orderedStudents = unorderedStudents.stream().sorted(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getName)).collect(Collectors.toList());

            for (int i = 0; i < orderedStudents.size(); i++) {
                String format = String.format("%d. %s <::> %d", i + 1, orderedStudents.get(i).getName(), orderedStudents.get(i).getScore());
                secondLine.add(format);
            }

            return firstLine + secondLine.stream().collect(Collectors.joining("\n"));
        }).collect(Collectors.joining("\n"));

        List<Student> finalScores = new ArrayList<>();
        students.entrySet().stream().forEach(student -> {
            String name = student.getKey();
            int score = student.getValue().values().stream().mapToInt(Integer::intValue).sum();
            finalScores.add(new Student(name, score));
        });

        List<Student> orderedFinalScores = finalScores.stream().sorted(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getName)).collect(Collectors.toList());
        List<String> finalLines = new ArrayList<>();
        
        for (int i = 0; i < orderedFinalScores.size(); i++) {
            String format = String.format("%d. %s -> %d", i + 1, orderedFinalScores.get(i).getName(), orderedFinalScores.get(i).getScore());
            finalLines.add(format);
        }


        // Print result
        System.out.println(collect);
        System.out.println("Individual standings:");
        System.out.println(finalLines.stream().collect(Collectors.joining("\n")));
        
        scan.close();
    }
}

//            Map<String, Integer> orderedMap = new LinkedHashMap<>();
//            participantsResults.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e -> orderedMap.put(e.getKey(), e.getValue()));

//            Map<String, Integer> orderedMap = new LinkedHashMap<>();
//            participantsResults.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).sorted(Comparator.comparing(Map.Entry::getKey).reversed()).forEach(e -> orderedMap.put(e.getKey(), e.getValue()));

// Create practice Student class
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getScore() {
        return this.score;
    }

    public Student setScore(int score) {
        this.score = score;
        return this;
    }
}

//    String zzzzzz = contests.entrySet().stream().map(contest -> {
//        String firstLine = String.format("%s: %d participants%n", contest.getKey(), contest.getValue().size());
//        StringBuilder secondLine = new StringBuilder();
//        students.entrySet().stream().map(student -> student.getValue().entrySet().stream()
//                                    .filter(filterContest -> filterContest.getKey().equals(contest.getKey())).map(s -> secondLine.append(String.format("%d. %s <::> %d%n", 1, s.getKey(), s.getValue()))));
//        return firstLine + secondLine;
//    }).collect(Collectors.joining("zzzzzz"));
//
//     System.out.println(zzzzzz);
//
//    Map<String, Long> sortedMap = map.entrySet().stream().sorted(reverseOrder(comparing(Entry::getValue))).collect(toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//    Map<String, Long> sortedMap = map.entrySet().stream().sorted(reverseOrder(comparingByValue())).collect(toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//    Map<String, Long> sortedMap = map.entrySet().stream().sorted(comparingByValue(reverseOrder())).collect(toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
