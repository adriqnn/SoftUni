package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _03_CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String path = "...";
        FileInputStream inputStream = new FileInputStream(path);

        int value = inputStream.read();

        while(value != -1){
            if(value != 10 && value != 32){
                System.out.print(value);
            }else{
                System.out.print((char) value);
            }
            value = inputStream.read();
        }
        inputStream.close();
        scan.close();
    }
}
