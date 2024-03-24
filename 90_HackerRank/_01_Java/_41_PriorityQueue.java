package _05_HackerRank._01_Java;

import java.util.*;
import java.util.stream.Collectors;

public class _41_PriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Students> students = priorities.getStudents(events).stream().sorted(Comparator.comparing(Students::getCGPA).reversed()
                .thenComparing(Students::getName).thenComparing(Students::getID)).collect(Collectors.toList());

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Students st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

class Priorities{
    public List<Students> getStudents(List<String> events){
        PriorityQueue<Students> studentsPriorityQueue = new PriorityQueue<>(Comparator.comparing(Students::getCGPA).reversed()
                .thenComparing(Students::getName).thenComparing(Students::getID));

        for (String event : events) {
            String[] commands = event.split("\\s+");
            String command = commands[0];
            if(command.equals("ENTER")){
                int id = Integer.parseInt(commands[3]);
                String name = commands[1];
                double cgpa = Double.parseDouble(commands[2]);
                Students student = new Students(id, name, cgpa);
                studentsPriorityQueue.offer(student);
            }else{
                studentsPriorityQueue.poll();
            }
        }
        return studentsPriorityQueue.stream().collect(Collectors.toList());
    }
}

class Students{
    private int id;
    private String name;
    private double cgpa;

    public Students(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }
}