package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _04_ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "...";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scan = new Scanner(inputStream);
        //PrintOutputStream out = new PrintStream(...);
        while(scan.hasNext()){
            if(scan.hasNextInt()){
                int number = scan.nextInt();
                System.out.println(number);
            }
            scan.next();
        }
        inputStream.close();
        scan.close();
    }
}
