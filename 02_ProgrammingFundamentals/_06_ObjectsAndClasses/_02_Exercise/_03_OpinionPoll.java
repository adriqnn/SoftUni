package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _03_OpinionPoll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Persons> listOfPeople = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] consoleLine = scan.nextLine().split("\\s+");
            String person = consoleLine[0];
            int age = Integer.parseInt(consoleLine[1]);
            Persons newOne = new Persons(consoleLine[0],Integer.parseInt(consoleLine[1]));
            listOfPeople.add(newOne);
        }
        /*listOfPeople.stream().sorted(Comparator.comparingInt(Persons::getAge).reversed()).forEach(e -> {
            if(e.getAge() >= 30) {
                System.out.println(e.getPerson() + " - " + e.getAge());
            }
        });*/
        listOfPeople.sort(Comparator.comparing(Persons::getPerson));

        listOfPeople.forEach(e -> {
            if(e.getAge() > 30) {
                System.out.println(e.getPerson() + " - " + e.getAge());
            }
        });
    }
}
class Persons{
    private String person;
    private int age;
    public Persons(String person, int age) {
        this.person = person;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getPerson() {
        return person;
    }
}

