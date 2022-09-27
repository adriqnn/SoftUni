package _02_ProgrammingFundamentals._06_ObjectsAndClasses._02_Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _06_OrderByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        List<Album> names = new ArrayList<>();
        while(!console.equals("End")){
            String[] consoleLine = console.split("\\s+");
            String name = consoleLine[0];
            String personalNumber = consoleLine[1];
            int age = Integer.parseInt(consoleLine[2]);
            console = scan.nextLine();
            Album person = new Album(name,personalNumber,age);
            names.add(person);
        }
        names.sort(Comparator.comparing(Album::getAge));
        names.forEach(e -> System.out.println(e));
    }
}
class Album{
    private String name ;
    private String personalNUmber;
    private int age;
    public Album(String name, String personalNUmber, int age) {
        this.name = name;
        this.personalNUmber = personalNUmber;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return String.format("%s with ID: %s is %d years old.",this.name,this.personalNUmber,this.age);
    }
}
