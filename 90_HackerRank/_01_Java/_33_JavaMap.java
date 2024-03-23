package _05_HackerRank._01_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _33_JavaMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n =Integer.parseInt(scan.nextLine());
        Map<String,String> phonebook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            String phone = scan.nextLine();
            phonebook.put(name,phone);
        }

        while(scan.hasNext()){
            String console = scan.nextLine();
            if(phonebook.containsKey(console)){
                System.out.printf("%s=%s%n",console,phonebook.get(console));
            }else{
                System.out.println("Not found");
            }
        }

        scan.close();
    }
}
