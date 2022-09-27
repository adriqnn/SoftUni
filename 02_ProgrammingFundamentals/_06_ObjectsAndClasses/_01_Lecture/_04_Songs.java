package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Songs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<SongClass> songsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("_");
            String type = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            SongClass song = new SongClass(type, name, time);
            songsList.add(song);
        }

        String consoleType = scan.nextLine();

        if(consoleType.equals("all")){
            for (SongClass element : songsList) {
                System.out.println(element);
            }
        }else{
            for (SongClass element : songsList) {
                if(element.getType().equals(consoleType)){
                    System.out.println(element);
                }
            }
        }
    }
}

class SongClass{
    private String type;
    private String name;
    private String time;
    public SongClass(String type, String name, String time) {
        this.type = type;
        this.name = name;
        this.time = time;
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return this.name;
    }
}
