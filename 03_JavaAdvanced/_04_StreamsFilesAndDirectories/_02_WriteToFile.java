package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class _02_WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "...";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scan = new Scanner(System.in);
        /*while(scan.hasNextLine()) {
            String line = scan.nextLine();
        }*/
        int value = inputStream.read();
        Set<Character> punctuation = Set.of(',','.','!','?');
        while(value != -1){
            char current = (char) value;
            if(!punctuation.contains(current)){
                System.out.print(current);
            }
            value = inputStream.read();
        }
        inputStream.close();
        scan.close();
    }
}
