package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _01_ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        // Path
        String path = "...";
        
        // Reader
        FileInputStream inputStream = new FileInputStream(path);
        int value = inputStream.read();
        
        // Read file from the system and print binary
        while(value != -1){
            System.out.print(Integer.toBinaryString(value) + " ");
            
            value = inputStream.read();
        }
        
        inputStream.close();
        scan.close();
    }
}
