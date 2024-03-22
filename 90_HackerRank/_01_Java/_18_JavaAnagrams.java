package _05_HackerRank._01_Java;

import java.util.Arrays;
import java.util.Scanner;

public class _18_JavaAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] arrayWordOne = scan.nextLine().toLowerCase().toCharArray();
        char[] arrayWordTwo = scan.nextLine().toLowerCase().toCharArray();

        Arrays.sort(arrayWordOne);
        Arrays.sort(arrayWordTwo);

        System.out.println(Arrays.compare(arrayWordOne, arrayWordTwo) == 0 ? "Anagrams" : "Not Anagrams");

        scan.close();
    }
}
