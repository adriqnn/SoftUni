package _02_ProgrammingFundamentals._05_Lists._01_Lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> productsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            productsList.add(scan.nextLine());
        }
        Collections.sort(productsList);
        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n",i+1,productsList.get(i));
        }
    }
}
