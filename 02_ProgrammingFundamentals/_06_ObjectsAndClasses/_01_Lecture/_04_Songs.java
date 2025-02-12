package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_Songs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        List<Song> songsList = new ArrayList<>();

        // Save the songs
        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("_");

            String type = tokens[0];
            String name = tokens[1];
            String time = tokens[2];

            Song song = new Song(type, name, time);
            songsList.add(song);
        }

        String consoleType = scan.nextLine();

        // Print result
        if (consoleType.equals("all")) {
            for (Song element : songsList) {
                System.out.println(element);
            }
        } else {
            for (Song element : songsList) {
                if (element.getType().equals(consoleType)) {
                    System.out.println(element);
                }
            }
        }

        scan.close();
    }
}

// Create practice Song class
class Song {
    private String type;
    private String name;
    private String time;

    public Song(String type, String name, String time) {
        this.type = type;
        this.name = name;
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
