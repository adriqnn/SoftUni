package _03_JavaAdvanced._03_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Set<String> guests = new TreeSet<>();
        while(!input.equals("PARTY")){
            guests.add(input);
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while(!input.equals("END")){
            guests.remove(input);
            input = scan.nextLine();
        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(),guests));
    }
}
