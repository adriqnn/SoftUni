package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _19_JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        List<String> list = Arrays.stream(console.split("!|,|\\?|\\.|_|'|@|\\s+")).collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")){
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")){
                list.remove(i);
            }
        }

        System.out.println(list.size());

        for ( String element: list) {
            System.out.println(element);
        }

        scan.close();
    }
}
