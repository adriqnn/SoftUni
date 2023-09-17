package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _05_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        // Path
        String path = "...";
        
        // Reader
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        //BufferedWriter writer = new BufferedWriter(new PrintWriter());
        
        //Read
        String line = reader.readLine();
        int count = 1;
        
        // Print every third line of the input file text
        while(line != null){
            if(count % 3 == 0){
                System.out.println(line);
            }
            
            line = reader.readLine();
            count++;
        }
        
        inputStream.close();
        scan.close();
        inputStreamReader.close();
        reader.close();
    }
}
