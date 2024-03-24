package _05_HackerRank._01_Java;

import java.util.ArrayList;
import java.util.Scanner;

public class _48_JavaInstanceOfKeyword {
    static String count(ArrayList list){
        int a = 0, b = 0, c = 0;
        for(int i = 0; i < list.size(); i++){
            Object element = list.get(i);
            if(element instanceof S)
            a++;
            if(element instanceof R)
            b++;
            if(element instanceof H)
            c++;
        }
        String ret = a + " " + b + " " + c;
        return ret;
    }

    public static void main(String []args){
        ArrayList list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++){
            String s = scan.next();
            if(s.equals("Student"))list.add(new S());
            if(s.equals("Rockstar"))list.add(new R());
            if(s.equals("Hacker"))list.add(new H());
        }
        System.out.println(count(list));
    }
}

class S{ }

class R{ }

class H{ }